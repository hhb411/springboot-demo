package com.example.controller;

import com.example.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/18.
 */
@RestController
public class DemoController {
    @Value(value = "${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Book book;

    @RequestMapping(value = "/")
    String index() {
        return "Hello Spring Boot! The BookName is "+bookName+
                ";and Book Author is "+bookAuthor+
                ";and Book PinYin is ";
    }

    @RequestMapping(value = "book")
    String book() {
        return book.getAuthor();
    }
}
