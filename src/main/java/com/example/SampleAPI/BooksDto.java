package com.example.SampleAPI;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BooksDto {
    /**書籍ID*/
    String id;

    /**書籍タイトル*/
    String title;

    /**出版社名*/
    String publisher;

    /**著者ID*/
    String author;

    // getter,setterの記載は省略
}
