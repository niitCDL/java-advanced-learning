package top.advanced.wrapper;

public class WrapperClassDemo3 {
    public static void main(String[] args) {
        // 自动拆箱
        Integer num1 = 19;
        int num2 = num1;
        System.out.println("num2=" + num2);

        // 手动拆箱
        int num3 = num1.intValue();
        System.out.println("num3=" + num3);
    }
}
