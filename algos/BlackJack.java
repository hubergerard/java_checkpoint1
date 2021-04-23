package algos;

import java.util.HashMap;

public class BlackJack {

    // TODO
    public static String score(String[] bank, String[] player) {
        int bankSCore =0;
        int playerScore=0;
        boolean playerHasAce = false;
        boolean playerHasFace = false;
        boolean bankHasFace = false;
        boolean bankHasAce = false;
        for (String card : player){
            if (card.matches("[JDK]")){
                playerHasFace=true;
                playerScore+=10;
            } else {
                if(Integer.valueOf(card) == 1) playerHasAce=true;
                if(Integer.valueOf(card) == 10) playerHasFace=true;
                playerScore+=Integer.valueOf(card);
            }
        }
        for (String card : bank){
            if (card.matches("[JDK]")){
                bankHasFace = true;
                bankSCore+=10;
            } else {
                if(Integer.valueOf(card) == 1) bankHasAce=true;
                if(Integer.valueOf(card) == 10) bankHasFace=true;
                bankSCore+=Integer.valueOf(card);
            }
        }
        if((playerHasAce && playerHasFace) || (bankHasAce && bankHasFace)) return "BLACKJACK!";
        return ((playerScore > 21 && bankSCore > 21) || (playerScore <= 21 && playerScore >= bankSCore) || bankSCore > 21) ? "Player wins!" : "Bank wins!";
    }
}
