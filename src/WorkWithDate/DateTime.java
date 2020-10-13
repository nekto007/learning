package WorkWithDate;

import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Now: " + date);
        date = date.withYear(2020);
        System.out.println("Right now time " + date);
        String fields = "\nYear:\t\t\t" + date.getYear();
        fields += "\nMonth:\t\t\t" + date.getMonth();
        fields += "\nNumber Month:\t\t" + date.getMonthValue();
        fields += "\nDay of Week:\t\t" + date.getDayOfWeek();
        fields += "\nDay of Month:\t\t" + date.getDayOfMonth();
        fields += "\nDay of Year:\t\t" + date.getDayOfYear();
        fields += "\nHour (0-23):\t\t" + date.getHour();
        fields += "\nMinute:\t\t\t" + date.getMinute();
        fields += "\nSecond:\t\t" + date.getSecond();
        System.out.println(fields);
    }
}
