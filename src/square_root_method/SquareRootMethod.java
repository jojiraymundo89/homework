package square_root_method;

import java.util.Scanner;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */
public class SquareRootMethod {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            double number = captureNumberFromConsole();
            double result = getSquareRootOf(number);
            printScreen("The Square Root of " + number + " is " + result);
            printScreen("Want to try another Number? (Y/N)");
            if (confirmRepeat().toUpperCase().equals("Y")) {
            } else {
                printScreen("Thank you for testing my Assignment.");
                repeat = false;
            }
        }
    }

    public static void printScreen(String whatToBePrinted) {
        System.out.println(whatToBePrinted);
    }

    public static double captureNumberFromConsole() {
        Scanner scan = new Scanner(System.in);
        printScreen("Please enter a Number:");
        double number = scan.nextDouble();
        return number;
    }

    public static double getSquareRootOf(double number) {
        double answer = Math.sqrt(number);
        return answer;

    }

    public static String confirmRepeat() {
        Scanner scan = new Scanner(System.in);
        String reply = scan.next();
        return reply;
    }
}
