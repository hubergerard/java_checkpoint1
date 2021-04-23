

import org.junit.Assert;
import org.junit.Test;

public class BlackJackTest {
  @Test
  public void testTrue() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testBlackJack() throws Exception {
      String[] player = new String[] {"10", "1"};
      String[] bank = new String[] {"10", "J"};
     Assert.assertEquals("BLACKJACK!", BlackJack.score(bank, player));
  }

  @Test
  public void testBank() throws Exception {
      String[] player = new String[] {"4", "9", "3"};
      String[] bank = new String[] {"10", "J"};
      Assert.assertEquals("Bank wins!", BlackJack.score(bank, player));
  }

  @Test
  public void testPlayer() throws Exception {
      String[] player = new String[] {"4", "9", "8"};
      String[] bank = new String[] {"10", "J"};
      Assert.assertEquals("Player wins!", BlackJack.score(bank, player));
  }

  @Test
  public void testBankTooMuch() throws Exception {
      String[] player = new String[] {"4", "9", "3"};
      String[] bank = new String[] {"10", "6", "K"};
      Assert.assertEquals("Player wins!", BlackJack.score(bank, player));
  }

  @Test
  public void testPlayerTooMuch() throws Exception {
      String[] player = new String[] {"4", "9", "K"};
      String[] bank = new String[] {"10", "5", "3"};
      Assert.assertEquals("Bank wins!", BlackJack.score(bank, player));
  }
}
