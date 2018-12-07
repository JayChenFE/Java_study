package com.study.spider.model;

public abstract class NewsReader {
    public abstract News readNews(String path);
    //1.文件 纯文件,word,json,xml
    //2.网络 url
    //3. 标准输入
    //4. 语音识别
}
