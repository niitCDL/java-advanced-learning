package top.advanced.reflection;


import java.lang.reflect.Field;

public class Student1 {

    // 昵称 私有字段
    private String nickname;

    // 余额 私有字段
    private float balance;

    // 职位 公有字段
    public String position;

    public static void main(String[] args) throws NoSuchFieldException {
        // 类名.class 方式获取 Class 实例
        Class<Student1> cls1 = Student1.class;
        // 获取 public 的字段 position
        Field position = cls1.getField("position");
        System.out.println(position);

        // 获取字段 balance
        Field balance = cls1.getDeclaredField("balance");
        System.out.println(balance);

        // 获取所有字段
        Field[] declaredFields = cls1.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.print("name=" + field.getName());
            System.out.println("\t type=" + field.getType());
        }
    }
}

