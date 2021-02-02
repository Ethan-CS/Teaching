package arrays;

import java.util.Scanner;


/**
 * Solution to ArraysExercises question 2.2. Noughts and Crosses is a two-player
 * game, played on a 3x3 board. The first player gets to place their mark ('X')
 * in any location on the board, then the second player can place their mark ('O')
 * anywhere not currently occupied by another mark. In each subsequent turn, players
 * 1 and 2 take turns placing their marks in unoccupied cells until either one player
 * gets a row, column or diagonal of three of their marks (in which case they win) or
 * the board becomes full (with no line of 3), in which case the game is a draw.
 *  
 * @author Ethan Kelly
 */
public class NoughtsAndCrosses {
	/**
	 * Nested class - the class that represents the board on which the game is played.
	 * This class contains the methods to initialise, update, represent and print to the
	 * standard output the board at any given state in the game.
	 * 
	 * @author Ethan Kelly
	 *
	 */
	public static class NoughtsAndCrossesBoard {
		private char[][] board = new char[3][3];

		/**
		 * When initialising a noughts and crosses board, make sure it's empty!
		 */
		public NoughtsAndCrossesBoard() {
			clearBoard();
		}
		
		/**
		 * Gives a String representation of the board that can be printed to the
		 * standard output.
		 * 
		 * @return textual representation of the board to print to the standard output.
		 */
		@Override
		public String toString() {
			String output = " ------------- \n";

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					output += " | " + board[i][j];
				}
				output += " |\n ------------- \n";
			}
			return output;
		}

		/**
		 * Clears the board, for starting a new game.
		 */
		public void clearBoard() {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					board[i][j] = ' ';
				}
			}
		}

		/**
		 * Adds a new player token to the given location in the board.
		 * 
		 * @param x the horizontal coordinate in the board.
		 * @param y the vertical coordinate in the board.
		 * @param c the character to be saved to the given location.
		 * @return 1 if the character has been added successfully, -1 otherwise.
		 */
		public int addChar(int x, int y, char c) {
			if (board[x][y] == ' ') {
				board[x][y] = c;
				return 1; // success
			} else {
				return -1;
			}
		}

		/**
		 * Checks whether the board is full - in which case, without any lines of three,
		 * the game is a draw and no further moves can be played.
		 * 
		 * @return true if the board is full, false if not.
		 */
		public boolean isBoardFull() {
			boolean isFull = true;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == ' ') {
						isFull = false;
					}
				}
			}

			return isFull;
		}

		/**
		 * Checks whether either player has won the game, by checking for a line of three
		 * of the same character in the rows, columns and diagonals.
		 * 
		 * @return true if a player has won, false if not.
		 */
		public boolean checkWin() {
			return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
		}

		/**
		 * Loops through the rows in the board to see if there is a row of 3 of the
		 * same character (to see if a player has won).
		 * 
		 * @return true if a row contains three of the same character, false if not.
		 */
		private boolean checkRowsForWin() {
			for (int i = 0; i < 3; i++) {
				if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Loops through the columns in the board to see if there is a row of 3 of the 
		 * same character (to see if a player has won).
		 * 
		 * @return true if a column contains three of the same character, false if not.
		 */
		private boolean checkColumnsForWin() {
			for (int i = 0; i < 3; i++) {
				if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Loops through the diagonals in the board to see if there is a row of 3 of the
		 * same character (to see if a player has won).
		 * 
		 * @return true if a diagonal contains three of the same character, false if not.
		 */
		private boolean checkDiagonalsForWin() {
			return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
					|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
		}

		/**
		 * Checks three characters to see if they are all the same character. This is
		 * used in verifying whether a player has won or not.
		 * 
		 * @param c1 the first character to check.
		 * @param c2 the second character to check.
		 * @param c3 the third character to check/
		 * @return true if all three characters are the same, false otherwise.
		 */
		private boolean checkRowCol(char c1, char c2, char c3) {
			return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
		}

	}

	public static void main(String[] args) {
		// Initialise and print the game board.
		NoughtsAndCrossesBoard gameBoard = new NoughtsAndCrossesBoard();
		System.out.println(gameBoard.toString());
		// Start up a new scanner to find the player names.
		Scanner scan = new Scanner(System.in);

		// Player turn will tell us who is to place a character.
		// 0 means 'O' plays, 1 means 'X'.
		int playerTurn = 0;
		char[] symbols = { 'O', 'X' };

		// Get the player names using the scanner object.
		System.out.println("Player 1, please enter your name.");
		String player1 = scan.nextLine();
		System.out.println("Thank you, " + player1 + "\nPlayer 2, please enter your name.");
		String player2 = scan.nextLine();
		System.out.println("Thank you, " + player2);
		// Give instructions as to how to enter coordinates so we can parse and use them.
		System.out.println(
				"Players: please enter move coordinates when directed in the form 'x y' (separated by a space)");

		// Main engine of the game
		label1: while (true) {
			int validMove = -1;
			while (validMove == -1) {
				System.out.println();
				// Figure out whose turn it is and get their move.
				if (playerTurn == 0) {
					System.out.print(player1);
				} else {
					System.out.print(player2);
				}
				System.out.println(", please enter move coordinates");
				String move = scan.nextLine();

				Scanner separator = new Scanner(move);
				int row = separator.nextInt();
				int col = separator.nextInt();

				// If the proposed move is not a valid move (i.e. trying to move to an occupied cell),
				// tell the player their move is illegal and try to get a valid move from them.
				validMove = gameBoard.addChar(row, col, symbols[playerTurn]);
				if (validMove == -1) {
					System.out.println("Cannot move on top of another piece!");
				}
				separator.close();

				// Check to see if either the board is full (draw) or someone has a line of 3 (win)
				if (gameBoard.isBoardFull() && !gameBoard.checkWin()) {
					System.out.println(gameBoard.toString());
					System.out.println("The game was a tie!");
				} else if (gameBoard.checkWin()) {
					System.out.println(gameBoard.toString());
					if (playerTurn == 0) {
						System.out.print(player1);
					} else {
						System.out.print(player2);
					}
					System.out.println(" Wins!");
					validMove = 0;
					break label1;
				} else {
					// If no one has won, give the next player their turn and continue.
					System.out.println(gameBoard.toString());
					playerTurn = 1 - playerTurn;
				}
				if (gameBoard.checkWin()) {
					break;
				}
			}
		}
		scan.close();
	}

}
