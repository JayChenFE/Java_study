package  com.study.io;

import java.io.IOException;


public class FileHelper {
    public static void copy(MyFile file1, MyFile file2) throws IOException {
        file2.writeString(file1.readToString());
    }
}

