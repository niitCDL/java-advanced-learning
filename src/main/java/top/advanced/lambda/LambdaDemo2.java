package top.advanced.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 通过匿名内部类实例实例化一个 Runnable 接口的实现类
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {  // 方法无形参列表，也无返回值
                System.out.println("Hello, 匿名内部类");
            }
        };
        // 执行匿名内部类的 run() 方法
        runnable1.run();

        // 无参数无返回值，通过 lambda 表达式来实例化 Runnable 接口的实现类
        Runnable runnable2 = () -> System.out.println("Hello, Lambda");
        // 执行通过 lambda 表达式实例化的对象下的 run() 方法
        runnable2.run();
    }
}
