package com.example.SampleValidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class WebFormController {
    public static void main(String[] args) {
        SpringApplication.run(com.example.SampleValidation.WebFormController.class, args);
    }

    @GetMapping("/webform")
    public String get(Model model) {
        // ここで空のオブジェクトを作成して渡す
        // 初期値を設定したい場合にはここで設定可能
        model.addAttribute("webForm", new WebForm());

        return "web_validate";
    }

    @PostMapping("/webform")
    public String post(@Validated @ModelAttribute("webForm") WebForm webForm, BindingResult result, Model model) {
        // 入力された情報を表示するために再投入
        model.addAttribute("webForm", webForm);

        if (result.hasErrors()) {
            // エラーがある場合にはその旨を表示する
            model.addAttribute("message", "エラーを修正してください");

            return "web_validate";
        } else {
            // エラーがなければ問題ないことを表示
            model.addAttribute("message", "問題ありません！");

            return "web_validate";
        }
    }
}