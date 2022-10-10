package exercises;
import java.util.*;

public class Exercise10 {
	public static void main(String[] args) {
		int a, b, c; //Declaration of variables
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Input the first value: "); //Program asking for input
		a = sc.nextInt(); //User input
		System.out.println("Input the second value: ");
		b = sc.nextInt();
		System.out.println("Input the third value: ");
		c = sc.nextInt();
		if (a + b == c) { //Boolean verification process
			System.out.println(a + " + " + b + " = " + c );
			System.out.println("True");
		} else {
			System.out.println(a + " + " + b + " = " + c );
			System.out.println("False");
		}
		sc.close(); //Closing scanner
	}
}
