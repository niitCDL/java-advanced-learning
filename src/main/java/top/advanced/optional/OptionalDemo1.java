package top.advanced.optional;

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        // 创建一个 StringBuilder 对象
        StringBuilder string = new StringBuilder("我是一个字符串");

        // 使用 Optional.of(T t) 方法，创建 Optional 对象，注意 T 不能为空：
        Optional<StringBuilder> stringBuilderOptional = Optional.of(string);
        System.out.println(stringBuilderOptional);
        System.out.println(stringBuilderOptional.get());

        // 使用 Optional.empty() 方法，创建一个空的 Optional 对象：
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        // 使用 Optional.ofNullable(T t) 方法，创建 Optional 对象，注意 t 允许为空：
        stringBuilderOptional = null;
        Optional<Optional<StringBuilder>> stringBuilderOptional1 = Optional.ofNullable(stringBuilderOptional);
        Optional<Integer> integer = Optional.ofNullable(null);
        System.out.println(stringBuilderOptional1);
        System.out.println(integer);
    }
}
