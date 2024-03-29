package com.sign.signdirector.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    @GetMapping({"/main"})
    public String main(HttpServletRequest request){


        return "admin/main";
    }
    @GetMapping({"/savePortfolioList"})
    public String savePortfolio(HttpServletRequest request){

        return "admin/portfolio/savePortfolioList";
    }
}
