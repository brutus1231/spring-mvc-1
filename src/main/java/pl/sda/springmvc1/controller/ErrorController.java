package pl.sda.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ErrorController {

    @PostMapping("/error-test")
    public String view() {

        if (1 == 1) {
            throw new NullPointerException();
        }
        return "no-error";
    }
}
