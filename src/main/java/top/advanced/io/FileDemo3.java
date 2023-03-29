package top.advanced.io;

import java.io.File;

public class FileDemo3 {

    public static void printResult(File file) {
        // 调用isFile()方法并接收布尔类型结果
        boolean isFile = file.isFile();
        String result1 = isFile ? "是已存在文件" : "不是已存在文件";
        // 掉用isDirectory()方法并接收布尔类型而己过
        boolean directory = file.isDirectory();
        String result2 = directory ? "是已存在目录" : "不是已存在目录";
        // 打印该file对象是否是已存在文件/目录的字符串结果
        System.out.print(file);
        System.out.print('\t' + result1 + '\t');
        System.out.println(result2);
    }

    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("C:/Users/lenovo/Desktop/geek/images");
        // 传入文件绝对路径
        File file = new File("C:/Users/lenovo/Desktop/geek/Hello.java");
        FileDemo3.printResult(dir);
        FileDemo3.printResult(file);
    }
}
