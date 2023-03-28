package top.advanced.string;

public class StringDemo6 {
    public static void main(String[] args) {
        String str = "HELLO world";
        //1.转小写
        String s1 = str.toLowerCase();
        System.out.println("字符串str为转换为小写后为：" + s1);

        //2.转大写
        String s2 = str.toUpperCase();
        System.out.println("字符串s为转换为大写后为：" + s2);

        //3.大小写互换
        // 先切割为数组
        String[] strArr = str.split(" ");
        // 将数组中元素转换大小写并连接为一个新的字符串
        String result = strArr[0].toLowerCase() + " " + strArr[1].toUpperCase();
        System.out.println("字符串str的大小写互换后为：" + result);
    }
}
