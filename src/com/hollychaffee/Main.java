package com.hollychaffee;


public class Main {

	public static void main(String[] args) { /* Void means don't send any value back-use void
		when creating a method and we don't want to return anything. */

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus); // Arguments are the actual values we want to send to the method.
		System.out.println("Your final score was " + highScore);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);


		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Danielle", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Joanna", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Linda", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Ashley", highScorePosition);

	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table");
	}

		public static int calculateHighScorePosition(int playerScore){

			if (playerScore >= 1000) {
				return 1;
			} else if (playerScore >= 500 && playerScore < 1000) {
				return 2;
			} else if (playerScore >= 100 && playerScore < 500) {
				return 3;
			} else {
				return 4;
			}
		}

		public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus){  /*Parameters are what we define when setting
	up a new method. By defining these parameters, Java will automatically create the variables with the appropriate data type. They will
	be deleted when the process is completed and goes back to the line after calculateScore. */

			if (gameOver) {
				int finalScore = score + (levelCompleted * bonus);
				finalScore += 2000;
				return finalScore;
			}
			return -1;  /* -1 is conventionally used to indicate an error. in searching algorithms -1 indicates an invalid
		value or a value not found. That is the reason for using -1 here. */

		}
	}





	/* A method is a block of code (collection of statements) that only runs when it is called. Methods allow us to reuse code which
	   saves time by not having to re-type code.
	   Method order -
	   		Modifier
	   		Return type
	   		Method name
	   		Parameters
	   		Exception (if needed)
	   		Method body (if needed)
	 */

