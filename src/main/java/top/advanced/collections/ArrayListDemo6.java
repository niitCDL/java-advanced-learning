package top.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {

    static class Student {
        private String nickname;

        private String position;

        public Student() {
        }

        public Student(String nickname, String position) {
            this.setNickname(nickname);
            this.setPosition(position);
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "nickname='" + nickname + '\'' +
                    ", position='" + position + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 实例化一个空列表
        List<Student> arrayList = new ArrayList<>();

        // 实例化3个学生对象
        Student student1 = new Student("Colorful", "服务端工程师");
        Student student2 = new Student("Lillian", "客户端工程师");
        Student student3 = new Student("小慕", "架构师");
        // 新增元素
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println(arrayList);
        // 删除元素
        arrayList.remove(student2);
        System.out.println("删除 student2 后：arrayList 内容为：" + arrayList);
        arrayList.remove(1);
        System.out.println("删除列表中索引位置为 1 的元素后，arrayList 内容为：" + arrayList);

        // 实例化一个新的学生对象
        Student student4 = new Student("小李", "UI设计师");
        // 修改元素
        arrayList.set(0, student4);
        System.out.println("修改后：arrayList 内容为" + student4);
        // 查询元素，将 get() 方法得到的 Object 类型强制转换为 Student 类型
        Student student = arrayList.get(0);
        System.out.println("索引位置 0 的学生的昵称为：" + student.getNickname());
        System.out.println("索引位置 0 的学生的职位为：" + student.getPosition());
    }
}
