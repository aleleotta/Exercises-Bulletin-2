package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Assign the first number: ");
		num1 = sc.nextInt();
		System.out.println("Assign the second number: ");
		num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} else {
			System.out.println(num2 + " > " + num1);
		}
		sc.close();
	}
}
