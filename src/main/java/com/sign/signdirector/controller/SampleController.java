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
@RequestMapping("/sample")
public class SampleController {
    @GetMapping("/ex1")
    public void ex1(){
        System.out.println("zz");
    }

    @GetMapping({"/ex2"})
    public void ex2(Model model){
        List<SampleDTO> list = IntStream.rangeClosed(1, 20).asLongStream().
                mapToObj(i -> {
                    SampleDTO dto = SampleDTO.builder()
                            .sno(i)
                            .first("First" + i)
                            .last("last" + i)
                            .regTime(LocalDateTime.now())
                            .build();
                    return dto;
                }).collect(Collectors.toList());

        model.addAttribute("list", list);
    }

}
