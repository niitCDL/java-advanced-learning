package top.advanced.method_references;

import java.util.Comparator;

public class MethodReferencesDemo2 {
    public static void main(String[] args) {
        // 使用 Lambda 表达式
        Comparator<Integer> comparator1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(comparator1.compare(11, 12));

        // 使用方法引用，类 :: 静态方法（ compare() 为静态方法）
        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(12, 11));
    }
}
