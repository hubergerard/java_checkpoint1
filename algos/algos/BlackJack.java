package algos;

import java.util.Collections;

public class BlackJack {

	// TODO
	public static String score(String[] bank, String[] player) {

		int bankScore = calculateScore(bank);
		int playerScore = calculateScore(player);

		if (playerScore == 21 && player.length == 2) {
			return "BLACKJACK!";
		}

		if (bankScore == 21 && bank.length == 2) {
			return "BLACKJACK!";
		}

		if (bankScore > 21) {
			return "Player wins!";
		}

		if (playerScore > 21) {
			return "Bank wins!";
		}

		if (playerScore >= bankScore) {
			return "Player wins!";
		} else {
			return "Bank wins!";
		}
	}

	private static int calculateScore(String[] hand) {
		int score = 0;
		int nbOfOne = 0;

		for (int i = 0; i < hand.length; i++) {
			String card = hand[i];
			switch (card) {
			case "K":
				score += 10;
				break;
			case "Q":
				score += 10;
				break;
			case "J":
				score += 10;
				break;
			case "1":
				nbOfOne++;
				break;
			default:
				score += Integer.parseInt(card);
				break;
			}
		}
		
		if (nbOfOne == 1) {
			score = addOneOrEleven(score);
		} else if (nbOfOne > 1) {
			score += (nbOfOne-1);
			score = addOneOrEleven(score);
		}
		return score;
	}

	private static int addOneOrEleven(int score) {
		if (score + 11 == 21) {
			score = 21;
		} else {
			score++;
		}
		return score;
	}
}
