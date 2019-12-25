package com.example.demo.controller;

import com.example.demo.pojo.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @ResponseBody
    @RequestMapping("/testDefaultJson")
    public List<Book> testDefaltJson(Model model) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "三国演义", "罗贯中", new Date()));
        books.add(new Book(2, "红楼梦", "曹雪芹", new Date()));
        model.addAttribute("books", books);
        return books;
    }

}
