package top.advanced.function;

import java.util.function.Supplier;

public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "只返回，不消费";
        String s = supplier.get();
        System.out.println(s);
    }
}
