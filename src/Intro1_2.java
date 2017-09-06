/**
 * Purpose: Display Username and password with welcome to csc200
 * @author Sami Jr
 * @License GNU
 * Created by SKommu on 9/05/2017
 */

import java.util.Scanner;

public class Intro1_2 {
    //Public means that the class can be accessed by any other class in any package. main is a method of the class
    public static void main(String[] args) {
        /**
         * Static means it is defined as a member of the class rather than a member of an instance of the class.
         * Static means it is defined as a member of the class rather than a member of an instance of the class
         */
        String username, password;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username");
        username = keyboard.nextLine();
        System.out.println("Enter password");
        password = keyboard.nextLine();
        System.out.println("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password);
        keyboard.close();
    }
}
