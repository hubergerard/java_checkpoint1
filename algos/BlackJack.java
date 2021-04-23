import java.util.HashMap;

public class BlackJack {

   
    public static String score(String[] handBank, String[] handPlayer) {
        
        if (blackJacks(handPlayer)) {
            return "BLACKJACK!";
        }
        if (countHand(handBank) > 21) {
            return "Player wins!";
        }
        if (countHand(handPlayer) > 21) {
            return "Bank wins!";
        }
        if (countHand(handPlayer)>=countHand(handBank)) {
            return "Player wins!";
        }
        return "Bank wins!";
    }
    

    private static boolean blackJacks(String[] hand) {
        boolean ace = false;
        boolean ten= false;
        for (String card : hand) {
            if (card.equals("10")) {
                ten = true;
            }
            if (card.equals("1")) {
                ace = true;
            }
        }
        return (ace==true&&ten==true);
    }
    
    private static int countHand(String[] hand) {
        HashMap<String, Integer> cards = new HashMap<>();
        cards.put("J", 10);
        cards.put("Q", 10);
        cards.put("K", 10);
        for (int i = 1; i <11; i++) {
            cards.put(String.valueOf(i), i);
        }
        int score = 0;
        for (String card : hand) {
            score += cards.get(card);
        }
        return score;
    }
}
