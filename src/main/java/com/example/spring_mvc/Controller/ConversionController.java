package com.example.spring_mvc.Controller;

import com.example.spring_mvc.Model.Conversion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversionController {
    @GetMapping("/")
    public String showConversionForm() {
        return "index";
    }
    @PostMapping("/test")
    public ModelAndView Result(double usdAmount) {
        double result =  usdAmount * 24.000;
        Conversion conversion = new Conversion(usdAmount, result);
        ModelAndView modelAndView = new ModelAndView("index.jsp");
        modelAndView.addObject("conversion", conversion);
        return modelAndView;
    }
}
