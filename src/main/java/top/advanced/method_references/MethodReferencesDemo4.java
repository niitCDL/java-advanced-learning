package top.advanced.method_references;

import java.util.Comparator;

/**
 * 这属于一个特殊情况，当函数式接口中的抽象方法有两个参数时，已实现方法的第 1 个参数作为方法调用者时，
 * 也可以使用方法引用。此时，就可以使用类来引用实例方法了（即实例中的String::compareTo）。
 */
public class MethodReferencesDemo4 {
    public static void main(String[] args) {
        // 使用 Lambda 表达式
        Comparator<String> comparator1 = (s1, s2) -> s1.compareTo(s2);
        int compare1 = comparator1.compare("Hello", "Java");
        System.out.println(compare1);

        // 使用方法引用，类 :: 实例方法（ compareTo() 为实例方法）
        Comparator<String> comparator2 = String::compareTo;
        int compare2 = comparator2.compare("Hello", "Hello");
        System.out.println(compare2);
    }
}
