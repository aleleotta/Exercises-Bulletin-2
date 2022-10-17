package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		double a, b, c; //Declaration of variables
		double root; //Declaration of root
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Type in the (a) value: "); //The program asks the user to enter values.
		a = sc.nextInt(); //User input
		System.out.println("Type in the (b) value: ");
		b = sc.nextInt();
		System.out.println("Type in the (c) value: ");
		c = sc.nextInt();
		root = Math.sqrt(b*b-(4*a*c)); //Square root function
		double x1 = (-b + root) / 2*a; //First solution with (+) operator
		double x2 = (-b - root) / 2*a; //Second solution with (-) operator
		if (a == 0 || root < 0) { //Three possible scenarios
			System.out.println("There are infinite solutions.");
		} else if ( a < 0 || a > 0 && root > 0) {
			System.out.println("There are two solutions.");
			System.out.println(x1 + ", " + x2);
		} else if ( root == 0) {
			System.out.println("There is only one solution.");
			System.out.println(x1);
		}
		sc.close(); //Closing scanner
	}
}
