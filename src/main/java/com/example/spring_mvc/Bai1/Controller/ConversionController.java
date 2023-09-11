package com.example.spring_mvc.Bai1.Controller;

import com.example.spring_mvc.Bai1.Model.Conversion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversionController {
    @GetMapping("/ha")
    public String showConversionForm() {
        return "index";
    }
    @PostMapping("/test")
    public ModelAndView Result(double usdAmount) {
        double result =  usdAmount * 24.000;
        Conversion conversion = new Conversion(usdAmount, result);
        ModelAndView modelAndView = new ModelAndView("bai1/index.jsp");
        modelAndView.addObject("conversion", conversion);
        return modelAndView;
    }
}
