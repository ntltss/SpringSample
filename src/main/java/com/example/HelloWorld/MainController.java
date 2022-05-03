package com.example.HelloWorld;

import com.example.SpringSample.SpringSampleApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message","Hello Spring Boot!");
        return "index";
    }
}