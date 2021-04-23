
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

	@Test
	public void testTrue() throws Exception {
		Assert.assertEquals(true, true);
	}

	@Test
	public void testFacto() throws Exception {
		Assert.assertEquals(1, Factorial.facto(0));
		Assert.assertEquals(1, Factorial.facto(1));
		Assert.assertEquals(2, Factorial.facto(2));
		Assert.assertEquals(6, Factorial.facto(3));
		Assert.assertEquals(24, Factorial.facto(4));
	}
}
