package top.advanced.exception;

public class ExceptionDemo1 {
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        // 调用 divide() 方法
        divide(2, 0);
    }
}
