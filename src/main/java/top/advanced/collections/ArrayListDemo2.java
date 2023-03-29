package top.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 实例化一个空列表
        List<String> arrayList = new ArrayList<>();
        // 将字符串元素 Hello 追加到此列表的末尾
        arrayList.add("Hello");
        // 将字符串元素 World 追加到此列表的末尾
        arrayList.add("World");
        // 打印列表
        System.out.println(arrayList);
        // 将字符串元素 Java 插入到此列表中的索引为 1 的位置
        arrayList.add(1, "Java");
        // 打印列表
        System.out.println(arrayList);
    }
}
