package top.advanced.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {

        // 实例化一个 Runnable 接口的匿名实现类对象
        Runnable runnable = () -> System.out.println("Hello, 匿名内部类");
        // 执行匿名内部类的 run() 方法
        runnable.run();
    }
}
