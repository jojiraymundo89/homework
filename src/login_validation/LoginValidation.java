package login_validation;

import java.util.Scanner;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */
public class LoginValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                     /***********************/
        String expectedUserName = "Selenium@winter.com"; //<----< /* Username & Password */
        String expectedPassword = "techno1234";                  /***********************/
        for (int i = 1; i < 6; i++) {
            System.out.println("Please enter your username:");
            String actualUsername = scan.nextLine();
            System.out.println("Please enter your password");
            String actualPassword = scan.nextLine();
            if (actualUsername.equals(expectedUserName) && actualPassword.equals(expectedPassword)) {
                System.out.println("You Have successfully entered into your account");
                System.out.println("Welcome to Home Page");
                break;
            } else if (i == 5)
                System.out.println("You have reached the maximum allowed number (5) of try.Your account will be locked for 10 minutes.");
            else {
                int count = 5 - i;
                System.out.println("Please enter valid username and password");
                System.out.println("You have " + count + " more tries");
            }
        }
    }
}
