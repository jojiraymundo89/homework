package date_now_method;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */
public class DateNowMethod {
    public static void main(String[] args) {
        printScreen("          Day Month Year");
        printScreen("Today is :" + getCurrentDate());
    }

    public static void printScreen(String whatToBePrinted) {
        System.out.println(whatToBePrinted);
    }

    public static String getCurrentDate() {
        Date dateToday = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd / MM / yyyy");
        String dateInString = sdf.format(dateToday);
        return dateInString;
    }
}
