package top.advanced.lambda;

import java.util.function.Consumer;

public class LambdaDemo3 {
    public static void main(String[] args) {

        // 单参数无返回值
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("Hello World!");

        Consumer<String> consumer2 = (String s) -> {
            System.out.println(s);
        };
        consumer2.accept("你好，世界！");

        // 省略类型后代码
        Consumer<String> consumer3 = (s) -> {
            System.out.println(s);
        };
        consumer3.accept("你好，世界！");

        // 省略小括号后代码
        Consumer<String> consumer4 = s -> {
            System.out.println(s);
        };
        consumer3.accept("你好，世界！");
    }
}
