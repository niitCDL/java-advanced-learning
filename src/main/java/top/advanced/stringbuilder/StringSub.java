package top.advanced.stringbuilder;

public class StringSub {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好，欢迎来到后端学习知识库");
        String substring = str.substring(7);
        System.out.println("str截取后子串为：" + substring);

        String substring1 = str.substring(3, 5);
        System.out.println("str截取后子串为：" + substring1);
    }
}
