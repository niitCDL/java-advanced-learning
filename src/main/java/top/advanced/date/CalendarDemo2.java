package top.advanced.date;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 设置2023年:
        calendar.set(Calendar.YEAR, 2023);
        // 设置3月: (2表示3月)
        calendar.set(Calendar.MONTH, 2);
        // 设置22日:
        calendar.set(Calendar.DATE, 22);
        // 设置时间:
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println(calendar.getTime());
    }
}
