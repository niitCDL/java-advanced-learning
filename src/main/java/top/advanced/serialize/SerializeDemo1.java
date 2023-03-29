package top.advanced.serialize;

import java.io.File;
import java.io.*;

/**
 * @author mqxu
 * @date 2023/3/23
 * @description SerializeDemo1
 **/
public class SerializeDemo1 {

    static class Cat implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        private String nickname;

        private Integer age;


        public Cat() {
        }

        public Cat(String nickname, Integer age) {
            this.nickname = nickname;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "nickname='" + nickname + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    /**
     * 序列化方法
     *
     * @param filepath 文件路径
     * @param cat      要序列化的对象
     */
    private static void serialize(String filepath, Cat cat) throws IOException {
        // 实例化file对象
        File file = new File(filepath);
        // 实例化文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        // 实例化对象输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // 保存cat对象
        objectOutputStream.writeObject(cat);
        // 关闭流
        fileOutputStream.close();
        objectOutputStream.close();
    }

    /**
     * 反序列化方法
     *
     * @param filepath 文件路径
     */
    private static void deserialize(String filepath) throws IOException, ClassNotFoundException {
        // 实例化file对象
        File file = new File(filepath);
        // 实例化文件输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        // 实例化对象输入流
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        System.out.println(o);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "C:\\Users\\lenovo\\Desktop\\geek\\hello.txt";
        Cat cat = new Cat("小米", 1);
//        serialize(filename, cat);
        deserialize(filename);
    }

}
