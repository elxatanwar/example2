package week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间的计算
 * @夏提
 * 03.18
 */
public class TimeCalculate {
    public static void main(String[] args) {
        String[] times = {"2019-03-15 15:20:59", "2019-03-16 19:20:30", "2019-03-17 08:26:45", "2019-03-18 15:24:14"};
        String[] results = new String[times.length];
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时间：" + format.format(new Date()));
        for (int i = 0; i < times.length; i++) {
            results[i] = timeCal(times[i]);
            System.out.println(times[i] + "  " + results[i]);
        }
    }

    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        long diff = 0;
        try {
            d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (seconds < 60) {
            return "刚刚";
        } else if (minutes < 60) {
            return minutes + "分钟前";
        } else if (hours < 24) {
            return hours + "小时前";
        } else {
            return days + "天前";
        }
    }
}
