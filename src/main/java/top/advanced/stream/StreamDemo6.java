package top.advanced.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 12,17);
        // 调用sorted()方法自然排序，并打印每个元素
        integers.stream().sorted().forEach(System.out::println);
        integers.stream().sorted((i1, i2) -> -Integer.compare(i1, i2)).forEach(System.out::println);
    }
}
