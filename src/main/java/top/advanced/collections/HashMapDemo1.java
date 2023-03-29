package top.advanced.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // 添加数据
        map.put("English", "英语");
        map.put("Chinese", "汉语");
        map.put("Java", "咖啡");
        // 打印 map
        System.out.println(map);
        // 删除 key 为 Java 的数据
        map.remove("Chinese");
        System.out.println("删除键为Chinese的映射后，map内容为：");
        // 打印 map
        System.out.println(map);
        // 修改元素：
        map.put("Java", "一种编程语言");
        System.out.println("修改键为Java的值后，Java=" + map.get("Java"));
        // 遍历map
        System.out.println("通过遍历entrySet方法得到 key-value 映射：");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        // 查找集合中键为 English 对应的值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if ("English".equals(key)) {
                System.out.println("English 键对应的值为：" + map.get(key));
                break;
            }
        }
    }
}
