package top.advanced.io;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("C:/Users/lenovo/Desktop/geek/codes");
        if (dir.exists()) {
            // 调用 delete() 方法
            boolean result = dir.delete();
            if (result) {
                System.out.println("目录删除成功");
            }
        }
    }
}
