package pl.sda.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NumbersController {

    @GetMapping("/numbers/{myNumber}")
    public String page(@PathVariable Long myNumber, Model model){
        model.addAttribute("number", "Wybrano " + myNumber);
        return "numbers";
    }
}
