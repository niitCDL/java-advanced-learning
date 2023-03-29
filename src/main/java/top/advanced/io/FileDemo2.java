package top.advanced.io;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        // 传入目录相对路径
        File imageDir = new File(".\\images");
        File geekDir = new File("..\\geek");
        // 传入文件相对路径
        File file = new File(".\\Hello.java");

        System.out.println("-- imagesDir ---");
        System.out.println(imageDir.getPath());
        System.out.println(imageDir.getAbsolutePath());
        System.out.println(imageDir.getCanonicalPath());

        System.out.println("-- geekDir ---");
        System.out.println(geekDir.getPath());
        System.out.println(geekDir.getAbsolutePath());
        System.out.println(geekDir.getCanonicalPath());

        System.out.println("-- file ---");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }
}
