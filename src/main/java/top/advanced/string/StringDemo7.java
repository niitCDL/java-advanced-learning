package top.advanced.string;

public class StringDemo7 {
    public static void main(String[] args) {
        // 用两种方法创建三个内容相同的字符串
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println("使用equals()方法比较str1和str2的结果为：" + str1.equals(str2));
        System.out.println("使用==运算符比较str1和str2的结果为：" + (str1 == str2));
        System.out.println("使用equals()方法比较str1和str3的结果为：" + str1.equals(str3));
        System.out.println("使用==运算符比较str1和str3的结果为：" + (str1 == str3));
    }
}
