package com.study.spider.model;

public class News implements IViewable {
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void display() {
        System.out.println("|Title| " + this.getTitle());
        System.out.println("|Content| " + this.getContent());
    }
}