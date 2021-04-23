import junit.framework.*;
import org.junit.Test;

public class StudentTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testNotLegal() throws Exception {
		assertEquals(false, Student.hasLegalAge(11));
	}

    @Test
    public void testLegal() throws Exception {
        assertEquals(true, Student.hasLegalAge(21));
    }

    @Test
    public void testEven() throws Exception {
        assertEquals('A', Student.getGroup(12));
    }

    @Test
    public void testOdd() throws Exception {
        assertEquals('B', Student.getGroup(23));
    }

    @Test
    public void testCountNone() throws Exception {
        String[] students = {};
        assertEquals(0, Student.countStudents(students));
    }

    @Test
    public void testCountStudents() throws Exception {
        String[] students = {"java", "js", "Java", "PHP", "JS", "JAVA", "Java"};
        assertEquals(4, Student.countStudents(students));
    }
}
