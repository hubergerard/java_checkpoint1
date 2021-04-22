package algos;

import junit.framework.*;
import org.junit.Test;

public class FactorielleTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testFacto() throws Exception {
		assertEquals(1, Factorielle.facto(0));
		assertEquals(1, Factorielle.facto(1));
		assertEquals(2, Factorielle.facto(2));
		assertEquals(6, Factorielle.facto(3));
		assertEquals(24, Factorielle.facto(4));
	}
}
