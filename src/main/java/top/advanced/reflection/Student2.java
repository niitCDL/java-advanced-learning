package top.advanced.reflection;

import java.lang.reflect.Field;

public class Student2 {
    public Student2() {
    }

    public Student2(String nickname, String position) {
        this.nickname = nickname;
        this.position = position;
    }

    private String nickname;

    public String position;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student2 student2 = new Student2("小王", "架构师");
        Class cls = student2.getClass();
        Field position = cls.getField("position");
        Object o = position.get(student2);
        System.out.println(o);

    }
}

class TestPrivateFieldAccess{
    public static void main(String[] args) throws Exception{
        Student2 student2 = new Student2("小王", "架构师");
        Class cls = student2.getClass();
        Field nickname = cls.getDeclaredField("nickname");
        // 设置可以访问
        nickname.setAccessible(true);
        Object o = nickname.get(student2);
        System.out.println(o);
    }
}
