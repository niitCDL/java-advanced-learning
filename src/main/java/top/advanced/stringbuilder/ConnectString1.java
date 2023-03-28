package top.advanced.stringbuilder;

public class ConnectString1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
//        str.append(" ");
//        str.append("world");
        str.append(" ").append("world");
        System.out.println(str);
    }
}
