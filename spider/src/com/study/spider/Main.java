package com.study.spider;

import com.study.spider.model.News;

public class Main {

    public static void main(String[] args) {
        News news = new News();
        news.read("");
        System.out.print( news.display());
    }
}
