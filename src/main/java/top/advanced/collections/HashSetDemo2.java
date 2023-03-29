package top.advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        // 实例化一个新的空集
        Set<String> hashSet = new HashSet<>();
        // 向 hashSet 集中依次添加元素：Python、Java
        hashSet.add("Python");
        hashSet.add("Java");
        // 打印 hashSet 的内容
        System.out.println(hashSet);
        // 删除 hashSet 中的 Python 元素
        hashSet.remove("Python");
        // 打印 hashSet 的内容
        System.out.println("删除 Python 元素后，hashSet中的内容为：" + hashSet);
    }
}