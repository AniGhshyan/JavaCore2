package lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date date = new Date();
//        System.out.println(sdf.format(date));
        String date = "12/06/2021";
        Date parse = sdf.parse(date);
        System.out.println(parse);
    }
}
