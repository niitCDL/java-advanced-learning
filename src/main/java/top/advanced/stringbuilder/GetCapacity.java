package top.advanced.stringbuilder;

public class GetCapacity {
    public static void main(String[] args) {
        // 调用StringBuilder的无参构造方法，生成一个str对象
        StringBuilder str = new StringBuilder();
        System.out.println("str的初始容量为：" + str.capacity());
        // 循环执行连接操作
        for (int i = 0; i < 16; i++) {
            str.append(i);
        }
        System.out.println("连接操作后，str的容量为" + str.capacity());
        System.out.println(str);
    }
}
