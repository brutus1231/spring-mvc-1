package pl.sda.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String page(Model model) {
        int x = 3;
        x++;
        return "hello";
    }
}
