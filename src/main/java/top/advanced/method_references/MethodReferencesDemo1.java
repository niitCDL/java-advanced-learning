package top.advanced.method_references;

import java.util.function.Consumer;

public class MethodReferencesDemo1 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("只消费，不返回");
    }
}
