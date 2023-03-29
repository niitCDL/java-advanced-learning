package top.advanced.method_references;

import java.util.function.Function;

public class MethodReferencesDemo3 {
    public static void main(String[] args) {
        // 使用 Lambda 表达式
        Function<Double, Long> function1 = d -> Math.round(d);
        Long apply1 = function1.apply(1.0);
        System.out.println(apply1);

        // 使用方法引用，类 :: 静态方法（ round() 为静态方法）
        Function<Double, Long> function2 = Math::round;
        Long apply2 = function2.apply(2.0);
        System.out.println(apply2);
    }
}
