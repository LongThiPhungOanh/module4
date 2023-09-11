package com.example.spring_mvc.Bai2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
        @GetMapping("/calculator")
        public String showCalculator() {
            return "/bai2/baitap2.jsp";
        }
        @PostMapping("/calculate")
        public String calculate(double num1, double num2,
                                @RequestParam("operation") String operation,
                                Model model) {
            double result = 0;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num1 != 0 && num2 != 0) {
                        result = num1 / num2;
                    }
                    break;
            }
            model.addAttribute("result", result);
            model.addAttribute("num1", num1);
            model.addAttribute("num2", num2);
            return "/bai2/baitap2.jsp";
        }
 }
