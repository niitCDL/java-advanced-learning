package top.advanced.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段内容，输入回车结束：");
        // 可以将用户输入的内容扫描为字符串
        //扫描到有效字符后,若在这之后扫描到无效字符例如空格或回车就会结束当前方法
        //若一开始就输入无效字符,也不会结束该方法,并且也不会接收该无效字符
        //例如 空格空格空格hello空格world 最终的结果就是hello
        String str = scanner.next();
        // 打印输出
        System.out.println("您输入的内容为：" + str);
        // 关闭扫描器
        scanner.close();
    }
}
