package top.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

    public static void main(String[] args) {
        // 实例化一个空列表
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Java");
        for (int i = 0; i < arrayList.size(); i ++) {
            System.out.println("索引位置" + i + "的元素为"  + arrayList.get(i));
        }
    }
}
