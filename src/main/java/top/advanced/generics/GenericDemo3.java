package top.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo3 {
    public void printListElement(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        // 实例化一个整型的列表
        List<Integer> integers = new ArrayList<>();
        // 添加元素
        integers.add(1);
        integers.add(2);
        integers.add(3);
        GenericDemo3 genericDemo3 = new GenericDemo3();
        // 调用printListElement()方法
        genericDemo3.printListElement(integers);

        // 实例化一个字符串类型的列表
        List<String> strings = new ArrayList<>();
        // 添加元素
        strings.add("Hello");
        strings.add("Java工程师");
        // 调用printListElement()方法
        genericDemo3.printListElement(strings);
    }
}
