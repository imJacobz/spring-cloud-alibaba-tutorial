package com.jacobz.nxauto.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@RequiredArgsConstructor
@ComponentScan({"com.jacobz.nxauto"})
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {

    private final AuthenticationEntryPoint authenticationEntryPoint; // handler for not logged in
    private final AuthenticationSuccessHandler authenticationSuccessHandler;
    private final AuthenticationFailureHandler authenticationFailureHandler;
    @Value("${spring.security.requestMatchers}")
    private String matchers;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        String[] ma;
        if(!matchers.isBlank()){
            ma = matchers.split(",");
        } else {
            ma = new String[0];
        }
        http
                .authorizeHttpRequests(req->
                        req.requestMatchers("/error", "/api/auth/login", "/api/auth/captcha", "/api/auth/reg").permitAll()
                            .requestMatchers(ma).permitAll()
                        .anyRequest().authenticated())
                .formLogin(form -> form.loginPage("/api/auth/login")
                        .successHandler(authenticationSuccessHandler)
                        .failureHandler(authenticationFailureHandler))
                .httpBasic(basic -> basic.authenticationEntryPoint(authenticationEntryPoint))
                .csrf(AbstractHttpConfigurer::disable)
                .logout((logout) -> logout.permitAll().deleteCookies("SESSION"));
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
