package top.advanced.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo3 {
    public static void main(String[] args) {
        // 实例化一个新的空集
        Set<String> hashSet = new HashSet<>();
        // 向 hashSet 集中依次添加元素：Python、Java、PHP
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("PHP");
        // 打印 hashSet 的内容
        System.out.println(hashSet);

        // 获取 hashSet 中元素的迭代器
        Iterator<String> iterator = hashSet.iterator();
        System.out.println("迭代器的遍历结果为：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}