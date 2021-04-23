
import java.util.HashMap;

public class BlackJack {
	
	public static final HashMap<String,Integer> cartesMap = createMap();
	
	private static HashMap<String, Integer> createMap() {
		
        HashMap<String, Integer> cartesMap = new HashMap<String,Integer>();

        cartesMap.put("1", 10);
        cartesMap.put("2", 2);
        cartesMap.put("3", 3);
        cartesMap.put("4", 4);
        cartesMap.put("5", 5);
        cartesMap.put("6", 6);
        cartesMap.put("7", 7);
        cartesMap.put("8", 8);
        cartesMap.put("9", 9);
        cartesMap.put("10", 10);
        
        cartesMap.put("J", 10);
        cartesMap.put("Q", 10);
        cartesMap.put("K", 10);
  
        return cartesMap;
    }
		

	public static String score(String[] bank, String[] player) {
		
		int resultBank = 0;
		int resultPlayer= 0;
		int topBlackJack= 0;
		String result = "";
		
		//calcul des cartes
		for (String cartePlayer : player) {
			resultPlayer += cartesMap.get(cartePlayer);
			if (cartePlayer.equals("1")) {
				topBlackJack++;
			}
			if (cartePlayer.equals("10")) {
				topBlackJack++;
			}
		}
		for (String carteBank : bank) {
			resultBank += cartesMap.get(carteBank);
		}
		
		if (resultPlayer > 21 ) {
			return "Bank wins!";
		} else if (resultBank > 21 ){ 
			return "Player wins!";
		} else 
			
			if (topBlackJack >= 2) {
				return "BLACKJACK!";
			} 	
		
			if (resultPlayer >= resultBank ) {
				return "Player wins!";
			} else {
				return "Bank wins!";
			}
		
	}

}
