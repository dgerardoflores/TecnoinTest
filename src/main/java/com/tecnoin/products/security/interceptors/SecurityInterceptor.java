package com.tecnoin.products.security.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecurityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String jwt = request.getHeader("Authorization");

        if (jwt == null || jwt.contentEquals("")) {
            response.setStatus(401);

            return false;
        }

        return true;
    }
}
