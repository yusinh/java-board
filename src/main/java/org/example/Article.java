package org.example;

import java.time.LocalDateTime;

public class Article {
    private int id; // 번호
    private String title; // 제목

    private String body; // 내용

    private String formattedDateTime;

    public Article(int id, String title, String body, String formattedDateTime) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.formattedDateTime = formattedDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return formattedDateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.formattedDateTime = formattedDateTime;
    }
}
