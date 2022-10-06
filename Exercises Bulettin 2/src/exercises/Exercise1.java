package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int num; //Declaration of variable
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Type in a random number: "); //The program asks for input.
		num = sc.nextInt(); //User input
		if(num % 2 == 0) { //Boolean verification of parity
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		sc.close(); //Closing scanner
	}
}
