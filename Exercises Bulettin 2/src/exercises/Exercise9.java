package exercises;
import java.util.*;

public class Exercise9 {
	public static void main(String[] args) {
		final int ROCK = 1; //Declaration of final variables (not changeable later in the code)
		final int PAPER = 2;
		final int SCISSORS = 3;
		int player1, player2; //Declaration of variables that are not final (changeable later in the code)
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Lets play a little game, shall we?"); //Program text introduction
		System.out.println("");
		System.out.println("Rock = 1, Paper = 2, Scissors = 3"); //Legend
		System.out.println("");
		System.out.println("Player 1, make a move!"); //Player 1 turn
		player1 = sc.nextInt(); //Player 1 input
		System.out.println("Player 2, make a move!"); //Player 2 turn
		player2 = sc.nextInt(); //Player 2 input
		if (player1 == ROCK && player2 == SCISSORS || player1 == PAPER && player2 == ROCK //Boolean verification of moves
				|| player1 == SCISSORS && player2 == PAPER) {
			System.out.println("Player1 WINS!"); //Player 1 best case scenario
		} else if (player2 == ROCK && player1 == SCISSORS || player2 == PAPER && player1 == ROCK
				|| player2 == SCISSORS && player1 == PAPER){
			System.out.println("Player2 WINS!"); //Player 2 best case scenario
		} else {
			System.out.println("TIE!"); //Parity
		}
		sc.close(); //Closing scanner
	}
}
