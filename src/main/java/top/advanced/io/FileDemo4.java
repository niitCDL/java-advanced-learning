package top.advanced.io;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("C:/Users/lenovo/Desktop/geek/codes");
        if (!dir.exists()) {
            // 调用 mkdir() 方法
            boolean result = dir.mkdir();
            if (result) {
                System.out.println("目录创建成功");
            }
        }
    }
}
