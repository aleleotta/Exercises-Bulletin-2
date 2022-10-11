package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int num1, num2; //Declaration of variables
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Assign the first number: "); //Program asks the user for input.
		num1 = sc.nextInt(); //User input
		System.out.println("Assign the second number: ");
		num2 = sc.nextInt();
		if(num1 > num2) { //Calculation
			System.out.println(num1 + " > " + num2);
		} else {
			System.out.println(num2 + " > " + num1);
		}
		sc.close(); //Closing scanner
	}
}
