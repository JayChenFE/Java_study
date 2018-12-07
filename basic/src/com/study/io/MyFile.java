package com.study.io;
/*
创建一个File类用于表示文件. 然后这个类能够满足以下几个功能:

拥有一个构造方法, 接收一个字符串, 表示硬盘中文件的路径. 表示创建的File对象对应的硬盘中的文件;
拥有一个readToString(); 方法, 功能是读取文件内容, 然后返回一个String;
拥有一个writeString(String content)方法, 功能是写入一个字符串到文件中;
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFile {

    private String Path;

    public MyFile(String path) {
        Path = path;
    }

    public String readToString() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(Path))) {
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
            }

            return builder.toString();

        } catch (IOException e) {
            throw e;
        }
    }

    public void writeString(String content) throws IOException {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Path, true)))) {
            out.write(content);

        } catch (IOException e) {
            throw e;
        }
    }
}