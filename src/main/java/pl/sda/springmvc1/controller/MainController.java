package pl.sda.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(@ModelAttribute("button1") String button,
                           Model model) {
        if (button != null && !button.isEmpty()) {
            model.addAllAttributes("text", "Klieknięto");
        }
        return "index";
    }
}
