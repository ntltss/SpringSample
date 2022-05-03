package com.example.SendForm;

import com.example.HelloWorld.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class WebFormController {
    public static void main(String[] args) {
        SpringApplication.run(WebFormController.class, args);
    }

    @GetMapping("/webform") //Getの場合
    public String get(Model model) {
        // ここで空のオブジェクトを作成して渡す
        // 初期値を設定したい場合にはここで設定可能
        model.addAttribute("webForm", new WebForm());

        return "web";
    }

    @PostMapping("/webform") // POSTの場合
    public String post(WebForm webForm, Model model) {
        // 入力された情報を表示するために再投入
        model.addAttribute("webForm", webForm);

        model.addAttribute("message", "データが送信されました");

        return "web";
    }
}