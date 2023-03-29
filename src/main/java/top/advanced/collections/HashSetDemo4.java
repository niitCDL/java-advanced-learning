package top.advanced.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo4 {

    /**
     * 静态内部类：学生
     */
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
        Set<Student> hashSet = new HashSet<>();
        // 实例化3个学生对象
        Student student1 = new Student("Colorful", "服务端工程师");
        Student student2 = new Student("Lillian", "客户端工程师");
        Student student3 = new Student("小慕", "架构师");
        // 新增元素
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        // 使用Iterator遍历hashSet
        Iterator<Student> iterator = hashSet.iterator();
        System.out.println("迭代器的遍历结果为：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 查找并删除
        if (hashSet.contains(student1)) {
            hashSet.remove(student1);
        }
        System.out.println("删除nickname为Colorful的对象后，集合元素为：");
        System.out.println(hashSet);
    }
}