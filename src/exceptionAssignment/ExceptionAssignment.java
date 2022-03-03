package exceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userEntry = "yes";
		Scanner sc = new Scanner(System.in);
		while (userEntry.equalsIgnoreCase("yes")) {
			try {
				// Input values for first Try: 10/3
				// Input values for second Try: 10/2.34
				// Input values for third Try: 10/0
				System.out.println("Enter value of x: ");
				int x = sc.nextInt();
				System.out.println("Enter value of y: ");
				int y = sc.nextInt();
				
				int divide = x / y; // may throw exception

				System.out.println("Compute of x and y is : " + divide);

			} catch (InputMismatchException ex) {

				// Input values for second Try: 10/2.34
				System.out.println("Input Mismatch Exception Reported! MUST ENTER INTEGER" + ex);
				// ex.printStackTrace();
			} catch (ArithmeticException e) {

				// Input values for third Try: 10/0
				System.out.println("Arthimatic Exception Reported!" + e);
				// e.printStackTrace();
			}
			
			System.out.println("Do you want to try again? yes/no");
			String exit = sc.next();
			userEntry = exit;
			
		} System.out.println("**End of the Code**");

	}
}
