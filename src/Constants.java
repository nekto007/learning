import java.io.*;
import java.util.Calendar;

public class Constants {
    public static void main(String[] args) throws IOException {
        Calendar calender;
        calender = Calendar.getInstance();
        File outFile = new File("123.txt");
        FileOutputStream file = new FileOutputStream("123.txt");
        String c = calender.getTime().toString();
        file.write(c.getBytes());
        System.out.println(c);
    }
}
