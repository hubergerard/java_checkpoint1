
public class BlackJack {
    // TODO
    public static String score(String[] bank, String[] player) {
        String result = "";

        if (isBlackJack(bank)) {
            return "BLACKJACK!";
        }

        if (isBlackJack(player)) {
            return "BLACKJACK!";
        }

        if (calculateScore(player) > 21) {
            return "Bank wins!";
        }

        if (calculateScore(bank) > 21) {
            return "Player wins!";
        }

        if (calculateScore(bank) > calculateScore(player)) {
            return "Bank wins!";
        } else {
            return "Player wins!";
        }

    }

    private static boolean isBlackJack(String[] hand) {
       boolean isHeads = false;
       boolean isAce = false;
        for (String card : hand) {
            if (card.equals("1")) {
                isAce = true;
            }
            if (card.equals("10") || card.equals("J") || card.equals("Q") || card.equals("K")) {
                isHeads = true;
            }
        }

        if (isAce && isHeads) {
            return true;
        } else {
            return false;
        }

    }

    private static int calculateScore(String[] hand) {
        int score = 0;
        for (String card : hand) {

            if (card.equals("J") || card.equals("Q") || card.equals("K")) {
                score += 10;
            } else if (card.equals("1")) {
                score += 11;
            } else {
                score += Integer.valueOf(card);
            }
        }
        return score;
    }
}
