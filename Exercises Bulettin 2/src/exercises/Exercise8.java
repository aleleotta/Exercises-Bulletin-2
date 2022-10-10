package exercises;
import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		double grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a grade: ");
		grade = sc.nextDouble();
		if (grade >= 0 && grade < 5) {
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
	}
}
/*[0-5) es INSUFICIENTE (0 inclusive)
[5-6) es SUFICIENTE (5 inclusive)
[6-7) es BIEN (6 inclusive)
[7-9) es NOTABLE (7 inclusive)
[9-10] es SOBRESALIENTE (9 y 10 inclusives)
*/