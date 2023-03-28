package top.advanced.exception;

public class ExceptionDemo2 {
    // 打印 a / b 的结果
    public static void divide(int a, int b) {
        if (b == 0) {
            // 抛出异常
            throw new ArithmeticException("除数不能为零");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        // 调用 divide() 方法
        divide(2, 0);
    }
}
