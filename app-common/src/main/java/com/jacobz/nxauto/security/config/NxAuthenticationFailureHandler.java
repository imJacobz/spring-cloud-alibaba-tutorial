package com.jacobz.nxauto.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jacobz.nxauto.common.model.ResponseData;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class NxAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().print(new String(mapper.writeValueAsBytes(new ResponseData().unauthorized().data(exception.getMessage()))));
    }
}
