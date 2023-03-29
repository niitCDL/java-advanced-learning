package top.advanced.date;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 获取今天是这一周的第几天
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        // 获取今天是这一月的第几天
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        // 获取今天是这一月的第几周
        int i2 = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        // 获取今天是这一年的第几天
        int i3 = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是这一周的第" + i + "天");
        System.out.println("今天是这一月的第" + i1 + "天");
        System.out.println("今天是这一月的第" + i2 + "周");
        System.out.println("今天是这一年的第" + i3 + "天");
    }
}
