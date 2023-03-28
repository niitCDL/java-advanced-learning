package top.advanced.scanner;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        // 将第一行输入扫描为字符串
        String name = scanner.nextLine();

        System.out.println("请输入您的年龄：");
        // 将第二行输入扫描为int类型
        int age = scanner.nextInt();

        System.out.println("请输入您的身高：");
        // 将第三行输入扫描为float类型
        float height = scanner.nextFloat();

        // 打印扫描器所扫描的值
        System.out.println("您的姓名为：" + name);
        System.out.println("您的年龄为：" + age);
        System.out.println("您的身高为：" + height);
        // 关闭扫描器
        scanner.close();
    }
}
