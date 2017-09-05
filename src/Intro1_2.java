import java.util.Scanner;

public class Intro1_2 {

    public static void main(String[] args) {
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
