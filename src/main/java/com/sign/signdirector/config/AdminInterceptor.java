package com.sign.signdirector.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        // 어드민인 경우 isAdmin 세션에 값을 저장
        boolean isAdmin = (session.getAttribute("isAdmin") == null) ? false : true; // 어드민 여부를 체크하는 로직을 구현해야 합니다.

        if(isAdmin) {
            request.getSession().setAttribute("isAdmin", true);
        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/common/404-2");
            modelAndView.addObject("msgCode", "관리자 권한이 없습니다.");
            throw new ModelAndViewDefiningException(modelAndView);
        }

        return true;
    }

}
