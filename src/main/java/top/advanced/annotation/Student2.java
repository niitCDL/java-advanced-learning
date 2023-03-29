package top.advanced.annotation;

import java.lang.reflect.Field;

public class Student2 {
    // 标注注解
    @Length(min = 2, max = 5, message = "昵称的长度必须在2~5之间")
    private String nickname;

    public Student2(String nickname) {
        this.setNickname(nickname);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void checkFieldLength(Student2 student) throws IllegalAccessException {
        // 遍历所有Field
        for (Field field: student.getClass().getDeclaredFields()) {
            // 获取注解
            Length annotation = field.getAnnotation(Length.class);
            if (annotation != null) {
                // 获取字段
                Object o = field.get(student);
                if (o instanceof String) {
                    String stringField = (String) o;
                    if (stringField.length() < annotation.min() || stringField.length() > annotation.max()) {
                        throw new IllegalArgumentException(field.getName() + ":" + annotation.message());
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student2 student = new Student2("我的名字很");
        student.checkFieldLength(student);
    }
}
