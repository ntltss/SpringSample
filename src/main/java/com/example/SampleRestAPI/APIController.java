package com.example.SampleRestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    //REST API実装
    @RequestMapping("/call")
    public BooksDto callApi(String id) {
        BooksDto book = new  BooksDto();
        book.setAuthor("佐藤太郎!");
        book.setTitle("やさしいSpring Boot");
        book.setId(id);
        book.setPublisher("第一出版社");
        return book;
    }
}