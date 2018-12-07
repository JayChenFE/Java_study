package com.study.spider.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNews extends News {

    public FileNews() {
        super();
    }

    public FileNews(String title, String content) {
        super(title, content);
    }

    public void read(String url) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
            title = reader.readLine();
            reader.readLine();//跳过空行
            content = reader.readLine();

        } catch (IOException ex) {
            System.out.println("新闻读取出错");
        }
    }

    @Override
    public String display() {
        return super.display() + " from 子类";
    }
}
