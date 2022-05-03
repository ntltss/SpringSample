package com.example.SampleRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class MainController {
    @Autowired
    BooksService booksservice;

    //外部API利用結果画面
    @RequestMapping("/booklist")
    public String booklist(Model model) {
        BooksDto [] books = booksservice.getBooks();
        model.addAttribute("books", Arrays.asList(books));
        return "booklist";
    }

    //追記
    @RequestMapping("/books")
    public String books() {
        return "books";
    }
}
