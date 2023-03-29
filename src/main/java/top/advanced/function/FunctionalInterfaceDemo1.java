package top.advanced.function;

import java.util.function.Consumer;

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("只消费，不返回");
    }
}
