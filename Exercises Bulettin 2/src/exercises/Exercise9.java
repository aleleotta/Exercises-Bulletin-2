package exercises;
import java.util.*;

public class Exercise9 {
	public static void main(String[] args) {
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		int player1, player2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play a little game, shall we?");
		System.out.println("");
		System.out.println("Rock = 1, Paper = 2, Scissors = 3");
		System.out.println("");
		System.out.println("Player 1, make a move!");
		player1 = sc.nextInt();
		System.out.println("Player 2, make a move!");
		player2 = sc.nextInt();
		if (player1 == ROCK && player2 == SCISSORS || player1 == PAPER && player2 == ROCK 
				|| player1 == SCISSORS && player2 == PAPER) {
			System.out.println("Player1 WINS!");
		} else if (player2 == ROCK && player1 == SCISSORS || player2 == PAPER && player1 == ROCK
				|| player2 == SCISSORS && player1 == PAPER){
			System.out.println("Player2 WINS!");
		} else {
			System.out.println("TIE!");
		}
		sc.close();
	}
}
