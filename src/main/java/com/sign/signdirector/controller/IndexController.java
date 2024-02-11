package com.sign.signdirector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping({"/", "/index","main.html"})
    public String index(HttpServletRequest request){
        HttpSession session = request.getSession();
        String adminCode = (request.getParameter("adminCode") == null) ?
                "" : request.getParameter("adminCode");

        if(adminCode.equals("모르가나")) {
            session.setAttribute("isAdmin", "Y");
        }

        return "main";
    }

    @GetMapping("/blank")
    public String blank(){
        return "blank";
    }

    @GetMapping("/common/404-2")
    public String page404(){
        return "common/404-2";
    }



}
