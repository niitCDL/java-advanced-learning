package top.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("Hello");
        String str = (String) arrayList.get(0);
        System.out.println("str=" + str);
    }
}
