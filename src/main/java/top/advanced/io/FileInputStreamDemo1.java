package top.advanced.io;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        // 实例化文件流
        InputStream fileInputStream = new FileInputStream("C:/Users/lenovo/Desktop/geek/hello.txt");
        for (;;) {
            int n = fileInputStream.read();
            if (n == -1) {
                // read() 方法返回-1 则跳出循环
                break;
            }
            // 将n强制转换为 char 类型
            System.out.print((char) n);
        }
        // 关闭文件流
        fileInputStream.close();
    }
}
