package top.advanced.string;


public class StringDemo4 {
    public static void main(String[] args) {
        String str = "I love Java";
        String substring = str.substring(2);
        String substring1 = str.substring(2, 6);
        System.out.println("从索引位置2到结束的子串为：" + substring);
        System.out.println("从索引位置2到索引位置6的子串为：" + substring1);
    }
}
