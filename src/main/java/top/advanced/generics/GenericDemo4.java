package top.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
    public void printListElement(List<? extends Number> list) {
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
        GenericDemo4 genericDemo3 = new GenericDemo4();
        // 调用printListElement()方法
        genericDemo3.printListElement(integers);

    }
}
