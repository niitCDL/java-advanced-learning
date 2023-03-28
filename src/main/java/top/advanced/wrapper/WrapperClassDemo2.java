package top.advanced.wrapper;

public class WrapperClassDemo2 {
    public static void main(String[] args) {
        // 自动装箱
        int num1 = 19;
        Integer num2 = num1;
        System.out.println("num2=" + num2);

        // 手动装箱:在 Java14 中已经过时，不推荐这样的操作
        Integer num3 = new Integer(20);
        System.out.println("num3=" + num3);
    }
}
