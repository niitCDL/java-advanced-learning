package top.advanced.reflection;

import java.lang.reflect.Field;

public class Student3 {
    // 昵称 私有字段
    private String nickname;

    public Student3() {
    }

    public Student3(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student3 student3 = new Student3("小王");
        Class cls = student3.getClass();
        Field nickname = cls.getDeclaredField("nickname");
        nickname.setAccessible(true);
        // 设置字段值
        nickname.set(student3, "Colorful");
        // 打印设置后的内容
        System.out.println(student3.getNickname());
    }
}
