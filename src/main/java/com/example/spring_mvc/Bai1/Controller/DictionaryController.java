package com.example.spring_mvc.Bai1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.HashMap;
import java.util.Map;
@Controller
public class DictionaryController {
    Map<String, String> dictionary;

    public DictionaryController() {
        dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("apple", "táo");
        dictionary.put("banana", "chuối");
        dictionary.put("candy", "kẹo");
    }
    @GetMapping ("/hi")
    public String show() {
        return "baiTap2.jsp";
    }
    @PostMapping("/lookup")
    public String lookup(@RequestParam String key, Model model) {
        String result = dictionary.getOrDefault(key, "Không tìm thấy từ");
        model.addAttribute("result", result);
        return "bai1/baiTap2.jsp";
    }
}
