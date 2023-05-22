package in.grs.TestApp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
				throw new IllegalArgumentException(
						"Please Sir/Madam Enter a Positive Number," + "\n Negative number not allowed!");
            }
            
            System.out.println("The entered number is: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
