package workshop;
import java.util.Scanner;
public class TicTacToeGame {
	 static void printBoard(char []board) {
		for ( int r=0; r<10; r++) {
			board[r] = ' ';
			System.out.println(board);
		}
	 }
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		
		 Scanner sc = new Scanner(System.in);
		 char [] board = new char[10];

	}
}