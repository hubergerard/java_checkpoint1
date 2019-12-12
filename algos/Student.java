import java.util.ArrayList;

public class Student {
	static boolean overAgeBoolean = false;
	static char studentChar;
	static int javaStudents = 0;
	String testString = "";

    // TODO hasLegalAge
	public static boolean hasLegalAge(int age) {
		overAgeBoolean = false;
		if (age >= 18)
			overAgeBoolean = true;
		return overAgeBoolean;
	}
	

    // TODO getGroup
	public static int getGroup(int number) {
		//char A;
		if (number % 2 == 0)
			studentChar = 'A';
		else
			studentChar = 'B';
		
		return studentChar;
	}


    // TODO countStudents
	public static int countStudents(String[] students) {
		int counter =0;
		for (String student:students) {
			student = student.toLowerCase();
			if (student.equals("java")) {
				counter++;
			}
			
		}
		return counter;
		
		
	}	
}
	
	



