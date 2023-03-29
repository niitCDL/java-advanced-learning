package top.advanced.date;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        // 实例化一个date对象
        Date date = new Date();
        // 调用 getTime() 方法
        long time = date.getTime();
        System.out.println(time);
    }
}
