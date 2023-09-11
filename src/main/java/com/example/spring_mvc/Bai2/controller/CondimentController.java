package com.example.spring_mvc.Bai2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {
    @GetMapping("/saves")
    public String show(){
        return "bai2/baitap1.jsp";
    }
    @PostMapping("/save")
    public String save (@RequestParam("cdm") String[] condiment , Model model) {
        model.addAttribute("list" , condiment);
        return "bai2/result.jsp";
    }

}

