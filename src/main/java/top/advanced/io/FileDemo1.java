package top.advanced.io;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("C:/Users/lenovo/Desktop/geek/images");
        // 传入文件绝对路径
        File file = new File("C:/Users/lenovo/Desktop/geek/Hello.java");
        // 打印两个File对象
        System.out.println(dir.isDirectory());
        System.out.println(file.isFile());
        System.out.println(File.separator);
    }
}
