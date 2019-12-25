package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Book {
    private Integer id;
    private String name;
    private String author;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publishDate;

    public Book(int i, String 三国演义, String 罗贯中, Date date) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
