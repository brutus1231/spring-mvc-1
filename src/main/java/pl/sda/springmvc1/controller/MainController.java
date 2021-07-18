package pl.sda.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }

    @PostMapping("/")
    public String buttonClick(Model model) {
        model.addAttribute("text", "Klieknięto");
        return "index";
    }
}
