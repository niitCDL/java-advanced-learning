package top.advanced.enums;

public class EnumDemo2 {
    public static void main(String[] args) {
        Gender male = Gender.MALE;
        // 打印 Gender 对象
        System.out.println(male);
        // 打印 getter方法的值
        System.out.println(male.getGender());
        System.out.println(Gender.FEMALE.getGender());
        System.out.println(Gender.UNKNOWN.getGender());
    }
}

enum Gender{
    // 1.提供当前枚举类的多个对象，多个对象之间使用逗号分割，最后一个对象使用分号结尾
    MALE("男"),
    FEMALE("女"),
    UNKNOWN("保密");

    /**
     * 2.声明枚举类的属性
     */
    private final String gender;


    /**
     * 3.编写构造方法，为属性赋值
     */
    Gender(String gender) {
        this.gender = gender;
    }

    /**
     * 4.提供getter
     */
    public String getGender() {
        return gender;
    }
}