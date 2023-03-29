package top.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        // 实例化一个空列表
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        // 将字符串元素 World 追加到此列表的末尾
        arrayList.add("World");
        // 打印列表
        System.out.println(arrayList);
        // 用字符串元素 Hello 替换此列表中索引位置为 1 的元素
        arrayList.set(1, "Java");
        System.out.println(arrayList);
    }
}
