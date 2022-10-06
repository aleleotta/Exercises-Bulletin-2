package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a random number: ");
		num = sc.nextDouble();
		if(num < 1 && num > -1 && num != 0) {
			System.out.println("The number is almost zero.");
		} else if (num == 0) {
			System.out.println("The number is zero.");
		} else if (num >= 1) {
			System.out.println("The number is NOT almost zero. It is equal or greater than 1.");
		} else if (num <= -1) {
			System.out.println("The number is NOT almost zero. It is equal or less than -1.");
		}
		sc.close();
	}
}
