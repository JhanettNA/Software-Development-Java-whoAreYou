
package java1whoareyou;
/**
 * I import the Scanner class to allow reading input from the user.
 */
import java.util.Scanner;
/**
 *
 * @author jhane
 */
public class Java1WhoAreYou {

    // Main method - the entry point of the program
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Boolean variable to control the loop (ask user if they want to continue or exit)
        boolean continueLoop = true;
        
        // While loop that runs as long as the user wants to continue
        while (continueLoop) {
            
            // Prompt the user for their name
            System.out.print("Please enter your name: ");
            
            // Read the user input (name) as a string
            String name = scanner.nextLine();
            
            // Check if the name contains only letters using a helper method
            if (isNameValid(name)) {
                
                // If the name is valid, print a friendly message
                System.out.println("Oh, that is a very nice name, " + name);
                
            } else {
                
                // If the name contains invalid characters, show an error message
                System.out.println("Invalid name. Please enter only letters.");
                
                // Skip the rest of the loop and ask for the name again
                continue;
            }
            
            // Ask the user if they want to continue or exit the program
            System.out.print("Do you want to continue? (yes/no): ");
            
            // Read the user response (yes or no)
            String response = scanner.nextLine();
            
            // If the user types "no", change the continueLoop to false to stop the loop
            if (response.equalsIgnoreCase("no")) {
                continueLoop = false;
                System.out.println("Goodbye!"); // Say goodbye when the user decides to exit
            }
        }
        
        // Close the scanner to free resources (important for resource management)
        scanner.close();
    }

    // Helper method to validate if the name contains only letters
    public static boolean isNameValid(String name) {
        
        // Loop through each character in the name string
        for (int i = 0; i < name.length(); i++) {
            
            // Check if the character is not a letter
            if (!Character.isLetter(name.charAt(i))) {
                
                // Return false if any character is not a letter
                return false;
            }
        }
        
        // If all characters are letters, return true (valid name)
        return true;
    }
}
