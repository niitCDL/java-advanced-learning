package top.advanced.lambda;

import java.util.Comparator;

public class LambdaDemo4 {
    public static void main(String[] args) {

        // 省略 return 和 {} 前代码
        Comparator<Integer> comparator1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println(comparator1.compare(12, 12));

        // 省略 return 和 {} 后代码
        Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator2.compare(12, 23));

    }
}
