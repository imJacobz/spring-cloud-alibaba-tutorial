package com.jacobz.nxauto.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jacobz.nxauto.common.model.ResponseData;
import com.jacobz.nxauto.security.model.NxUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class NxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        HttpSession session = request.getSession();
        NxUser user = (NxUser) authentication.getPrincipal();
        // anything you want to send to frontend
        Map<String, Object> data = new HashMap<>();
        data.put("token", session.getId());
        data.put("username", user.getUsername());
        data.put("userId", user.getId());
        data.put("email", user.getEmail());
        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().print(new String(mapper.writeValueAsBytes(new ResponseData().success().data(data))));
    }
}
