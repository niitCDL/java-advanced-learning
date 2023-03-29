package top.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

    public static void main(String[] args) {
        // 实例化一个空列表
        List<String> arrayList = new ArrayList<>();
        // 将字符串元素 Hello 追加到此列表的末尾
        arrayList.add("Hello");
        // 将字符串元素 World 追加到此列表的末尾
        arrayList.add("World");
        // 将字符串元素 Hello 追加到此列表的末尾
        arrayList.add("Hello");
        // 将字符串元素 Java 追加到此列表的末尾
        arrayList.add("Java");
        // 打印列表
        System.out.println(arrayList);

        // 删除此列表中索引位置为 3 的元素
        arrayList.remove(3);
        // 打印列表
        System.out.println(arrayList);

        // 删除此列表中第一次出现的 Hello 元素
        arrayList.remove("Hello");
        System.out.println(arrayList);
    }
}
