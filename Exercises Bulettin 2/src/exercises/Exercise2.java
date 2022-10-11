package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int num1, num2; //Declaration of variables
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Type in the first number: "); //The program asks for first user input.
		num1 = sc.nextInt(); //User input
		System.out.println("Type in the second number: "); //The program asks for second user input.
		num2 = sc.nextInt(); //User input
		if(num1 == num2) { //The program checks if both numbers are equal and prints it out to the user.
			System.out.println("Both numbers are equal.");
		} else {
			System.out.println("Both numbers are different.");
		}
		sc.close(); //Closing scanner
	}
}
