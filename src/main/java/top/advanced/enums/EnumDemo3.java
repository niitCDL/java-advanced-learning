package top.advanced.enums;

public class EnumDemo3 {
    public static void main(String[] args) {
        MyGender male = MyGender.MALE;
        System.out.println("调用 toString() 方法：");
        System.out.println(male.toString());

        System.out.println("调用 values() 方法：");
        MyGender[] values = MyGender.values();
        for (MyGender value : values) {
            System.out.println(value);
        }

        System.out.println("调用 valueOf() 方法：");
        Gender male1 = Gender.valueOf("MALE");
        System.out.println(male1);
    }
}

/**
 * 使用 enum 关键字定义枚举类，默认继承自 Enum 类
 */
enum MyGender {
    // 1.提供当前枚举类的多个对象，多个对象之间使用逗号分割，最后一个对象使用分号结尾
    MALE("男"), FEMALE("女"), UNKNOWN("保密");

    /**
     * 2.声明枚举类的属性
     */
    private final String gender;

    /**
     * 3.编写构造方法，为属性赋值
     */
    MyGender(String gender) {
        this.gender = gender;
    }

    // 提供 getter
    public String getGender() {
        return gender;
    }
}