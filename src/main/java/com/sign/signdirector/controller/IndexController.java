package com.sign.signdirector.controller;

import com.sign.signdirector.dto.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/blank")
    public String blank(){
        return "blank";
    }



}
