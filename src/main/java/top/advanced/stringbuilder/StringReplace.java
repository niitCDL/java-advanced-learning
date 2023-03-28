package top.advanced.stringbuilder;

public class StringReplace {
    public static void main(String[] args) {
        // 初始化一个内容为 Hello 的字符串生成器
        StringBuilder str = new StringBuilder("Hello World!");
        // 调用字符串替换方法，将 World 替换为 Java
        str.replace(6, 11, "Java");
        // 打印替换后的字符串
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("Hello World!");
        str1.delete(6, 11);
        str1.insert(6, "Java");
        System.out.println(str1);
    }
}
