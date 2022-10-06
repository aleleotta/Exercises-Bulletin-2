package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Assign the first number: ");
		num1 = sc.nextInt();
		System.out.println("Assign the second number: ");
		num2 = sc.nextInt();
		System.out.println("Assign the third number: ");
		num3 = sc.nextInt();
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + " > " + num2 + " > " + num3);
		} else if (num2 > num3 && num3 > num1) {
			System.out.println(num2 + " > " + num1 + " > " + num3);
		} else if (num3 > num1 && num1 > num2) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		} else if (num2 > num1 && num1 > num3) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		} else if (num2 > num3 && num3 > num1) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		} else if (num3 > num2 && num2 > num1) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		}
		sc.close();
	}
}
