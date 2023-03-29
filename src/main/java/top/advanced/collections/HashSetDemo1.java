package top.advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        // 实例化一个新的空集
        Set<String> hashSet = new HashSet<String>();
        // 向 hashSet 集中依次添加元素：Python、Java、PHP、TypeScript、Python
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("PHP");
        hashSet.add("TypeScript");
        hashSet.add("Python");
        // 打印 hashSet 的内容
        System.out.println("hashSet中的内容为：" + hashSet);
    }
}