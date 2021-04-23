package algos;

import java.util.Arrays;

public class BlackJack {
    public static String score(String[] bank, String[] player) {

        int bankPoint = 0;
        int playerPoint = 0;

        for (int i =0; i<bank.length; i++ )
        {
            bank[i] = bank[i].replaceAll("[JQK]","10");
            bankPoint += new Integer(bank[i]);
        }

        for (int i =0; i<player.length; i++ )
        {
            player[i] = player[i].replaceAll("[JQK]","10");
            playerPoint += new Integer(player[i]);
        }

        bank[1].valueOf("5");

        if (playerPoint == 11 && bank[0].contains("1") && bank[1].contains("10"))
        {
            return "BLACKJACK!";
        }

        if ((playerPoint >= bankPoint && playerPoint <= 21) || (bankPoint > 21))
        {
            return "Player wins!";
        }
        else {
            return "Bank wins!";
        }

        //Arrays.stream(bank).map(s -> s.replaceAll("K","10"));

    }
}
