package top.advanced.exception;

public class ExceptionDemo3 {
    // 打印 a / b 的结果
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            // try 语句块
            // 调用 divide() 方法
            divide(2, 0);
        } catch (ArithmeticException e) {
            // catch 语句块
            System.out.println("catch: 发生了算数异常：" + e);
        } finally {
            // finally 语句块
            System.out.println("finally: 无论是否发生异常，都会执行");
        }
    }
}
