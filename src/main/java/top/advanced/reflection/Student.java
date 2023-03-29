package top.advanced.reflection;

public class Student {
    // 无参构造方法
    public Student() {
    }

    // 有参构造方法
    public Student(String nickname) {
        this.nickname = nickname;
    }

    // 昵称
    private String nickname;


    // 定义getter和setter方法
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public static void main(String[] args) throws ClassNotFoundException {
        // 方法1：类名.class
        Class cls1 = Student.class;

        // 方法2：对象.getClass()
        Student student = new Student();
        Class cls2 = student.getClass();

        // 方法3：Class.forName("包名.类名")
        Class cls3 = Class.forName("top.advanced.reflection.Student");
    }
}
