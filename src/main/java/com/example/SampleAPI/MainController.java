package com.example.SampleAPI;

import com.example.SampleJPA.SpringbootHellodbApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class MainController {
    @Autowired
    BooksService booksService;

    //外部API利用結果画面
    @RequestMapping("/booklist")
    public String bookspage(Model model) {
        BooksDto[] books = booksService.getBooks();
        model.addAttribute("books", Arrays.asList(books));
        return "booklist";
    }
}