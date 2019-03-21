package com.rm.springboot203;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song",new song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadFormPage(@ModelAttribute song song, Model model ){
        model.addAttribute("song",song);
        return "confirmsong";
    }
}

