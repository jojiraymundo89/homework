package calculator_method;

import java.util.Scanner;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */
public class Calculator {
    public static void main(String[] args) {
        boolean repeat = true;                             /*********************/
        while (repeat) {                                  /* Simple Calculator */
            double[] numbers = new double[2];            /*********************/

            boolean isAvalidNumber = false;
            int i = 0;
            while (!isAvalidNumber) {
                if (i == 0)
                    System.out.println("Please enter a number...");
                else System.out.println("Please enter another number...");
                Scanner scan = new Scanner(System.in);

                if (scan.hasNextDouble()) {
                    numbers[i] = scan.nextDouble();
                    i = i + 1;
                    if (i == 2)
                        isAvalidNumber = true;
                } else {
                    System.out.println("what you entered is not a number. Please enter a valid one..");
                }
            }

            boolean legit = false;
            while (!legit) {
                System.out.println("You have entered " + numbers[0] + " and " + numbers[1]);
                System.out.println("Please select (1) Addition, (2) Subtraction, (3) Multiplication and (4) Division");
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    int choice = scan.nextInt();


                    switch (choice) {
                        case 1:
                            System.out.println(numbers[0] + " + " + numbers[1] + " = " + addition(numbers[0], numbers[1]));
                            legit = true;
                            break;
                        case 2:
                            System.out.println(numbers[0] + " - " + numbers[1] + " = " + subtraction(numbers[0], numbers[1]));
                            legit = true;
                            break;
                        case 3:
                            System.out.println(numbers[0] + " x " + numbers[1] + " = " + multiplication(numbers[0], numbers[1]));
                            legit = true;
                            break;
                        case 4:
                            System.out.println(numbers[0] + " / " + numbers[1] + " = " + division(numbers[0], numbers[1]));
                            legit = true;
                            break;
                        default:
                            System.out.println("Your choice is not an options. Please enter again...");

                    }
                } else System.out.println("You entered an invalid character. Please do it again...");
            }
            System.out.println("Want to perform another operation? (Y/N)");
            Scanner scan = new Scanner(System.in);
            if (scan.next().toUpperCase().equals("N")) {
                repeat = false;
                System.out.println("Thank you for using this calculator.");
            }
        }

    }

    public static double addition(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public static double subtraction(double x, double y) {
        double difference = x - y;
        return difference;
    }

    public static double multiplication(double x, double y) {
        double product = x * y;
        return product;
    }

    public static double division(double x, double y) {
        double quotient = x / y;
        return quotient;
    }
}
