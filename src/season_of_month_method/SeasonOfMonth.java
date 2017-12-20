package season_of_month_method;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */
public class SeasonOfMonth {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            printScreen("Enter Month in any format:('02','Feb'or'February')");
            Scanner scan = new Scanner(System.in);
            boolean isValidInput = false;
            int monthIndex = 0;
            if (scan.hasNextInt()) {
                int inputNumber = scan.nextInt();
                if ((inputNumber > 0) && (inputNumber < 13)) {
                    monthIndex = inputNumber - 1;
                    isValidInput = true;
                }
            } else {
                Calendar calendarMonth = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
                SimpleDateFormat sdf2 = new SimpleDateFormat("MMM");
                String consoleMonth = scan.next();
                for (int i = 0; i < 12; i++) {
                    calendarMonth.set(Calendar.MONTH, i);
                    String calendarMonthString = sdf.format(calendarMonth.getTime());
                    String calendarMonthString2 = sdf2.format(calendarMonth.getTime());
                    if (calendarMonthString.toLowerCase().equals(consoleMonth.toLowerCase())
                            || calendarMonthString2.toLowerCase().equals(consoleMonth.toLowerCase())) {
                        monthIndex = i;
                        isValidInput = true;
                        break;
                    }

                }
            }
            if (isValidInput) {
                printScreen(getSeasonOfMonth(monthIndex));               /* <<<<<<<<<===================<<<<<<<<<<< */
            } else {                                                    /* Required Method to Determine the Season */
                printScreen("Please enter a valid month");
            }
            printScreen("Do you want to enter another month?(Y/N)");
            String decision = confirmRepeat();
            if (decision.toUpperCase().equals("N")) {
                printScreen("Thank you.");
                repeat = false;
            } else if (decision.toUpperCase().equals("Y")) {
            } else {
                printScreen("You did not make the right selection, System aborted, please run again.");
                repeat = false;
            }
        }
    }

    public static void printScreen(String whatToBePrinted) {
        System.out.println(whatToBePrinted);
    }

    public static String confirmRepeat() {
        Scanner scan = new Scanner(System.in);
        String reply = scan.next();
        return reply;
    }

    public static String getSeasonOfMonth(int index) {
        String seasonIdentifier = "Unknown Season";
        switch (index) {
            case 11:
            case 0:
            case 1:
                seasonIdentifier = "WINTER";
                break;
            case 2:
            case 3:
            case 4:
                seasonIdentifier = "SPRING";
                break;
            case 5:
            case 6:
            case 7:
                seasonIdentifier = "SUMMER";
                break;
            case 8:
            case 9:
            case 10:
                seasonIdentifier = "FALL";
                break;
            default:
        }
        Calendar calendarMonth = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        calendarMonth.set(Calendar.MONTH, index);
        String stringMonth = sdf.format(calendarMonth.getTime());
        String seasonOfMonth = stringMonth + " is in the Season of " + seasonIdentifier;
        return seasonOfMonth;
    }

}
