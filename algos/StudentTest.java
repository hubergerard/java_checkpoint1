
import org.junit.Assert;
import org.junit.Test;

public class StudentTest  {

	@Test
	public void testTrue() throws Exception {
	   	Assert.assertEquals(true, true);
	}

	@Test
	public void testNotLegal() throws Exception {
		Assert.assertEquals(false, Student.hasLegalAge(11));
	}

    @Test
    public void testLegal() throws Exception {
        Assert.assertEquals(true, Student.hasLegalAge(21));
    }

    @Test
    public void testEven() throws Exception {
        Assert.assertEquals('A', Student.getGroup(12));
    }

    @Test
    public void testOdd() throws Exception {
        Assert.assertEquals('B', Student.getGroup(23));
    }

    @Test
    public void testCountNone() throws Exception {
        String[] students = {};
        Assert.assertEquals(0, Student.countStudents(students));
    }

    @Test
    public void testCountStudents() throws Exception {
        String[] students = {"java", "js", "Java", "PHP", "JS", "JAVA", "Java"};
        Assert.assertEquals(4, Student.countStudents(students));
    }
}
