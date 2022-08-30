package home.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String getFirstView() {
        return "first-view";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}