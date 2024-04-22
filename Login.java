package accountcreation;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
    // To login please enter yor username and password
    String predefinedUsername = "Mpho_";
    String predefinedPassword = "Qu3st!on";
    String predefinedFirstName = "Mpho";
    String predefinedLastName = "Thabane";
    
         try ( // Prompt user to input username and password
        Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();    
        
        // Compare input with predefined values
           if (enteredUsername.equals(predefinedUsername) && enteredPassword.equals(predefinedPassword)) {
               System.out.println("Welcome, " + predefinedFirstName + " " + predefinedLastName + ",it great"
                       + " to see you again.");
            } else {
               System.out.println("Username or password incorrect, Please try again.");
            }
        }
    }
}