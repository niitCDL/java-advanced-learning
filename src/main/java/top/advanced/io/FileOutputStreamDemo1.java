package top.advanced.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("C:/Users/lenovo/Desktop/geek/hello.txt",true);
        // 写入 3 个H字符
        fileOutputStream.write(72);
        fileOutputStream.write(72);
        fileOutputStream.write(72);
        fileOutputStream.close();
    }
}
