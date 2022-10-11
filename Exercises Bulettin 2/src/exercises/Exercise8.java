package exercises;
import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		double grade; //Declaration of variable
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Input a grade: "); //Program asks for a grade input
		grade = sc.nextDouble(); //User input
		if (grade >= 0 && grade < 5) { //Verification, and output.
			System.out.println("UNSATISFACTORY");
		} else if (grade >= 5 && grade < 6) {
			System.out.println("SATISFACTORY");
		} else if (grade >= 6 && grade < 7) {
			System.out.println("GOOD");
		} else if (grade >= 7 && grade < 9) {
			System.out.println("GREAT");
		} else if (grade >= 9 && grade < 10) {
			System.out.println("EXCELLENT");
		} else if (grade == 10) {
			System.out.println("PERFECT");
		} else {
			System.out.println("Grade value is not valid.");
		}
		sc.close(); //Closing scanner
	}
}