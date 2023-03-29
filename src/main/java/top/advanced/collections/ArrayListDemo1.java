package top.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 实例化一个空列表
        List arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            // 将元素 i 追加到列表的末尾
            arrayList.add(i);
            // 打印列表内容
            System.out.println(arrayList);
        }
    }
}
