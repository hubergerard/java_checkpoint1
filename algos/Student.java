
public class Student {
	
	public static boolean isLegal(int age) {
		// Create a static method named isLegal, which returns "true" if the age passed
		// as an argument is greater than or equal to 18 and returns "false" if it is
		// not.
		return (age >= 18) ? true : false;
	}
	
	public static boolean hasLegalAge(int age) {
		return Student.isLegal(age);
	}

	public static char giveGroup(int studNumber) {

		// Create a static method called giveGroup, which takes in a student's number.
		// If this is even, return the character "A", otherwise return the character
		// "B".

		return (studNumber % 2 == 0) ? 'A' : 'B';

	}
	
	public static char getGroup (int studNumber) {
		return Student.giveGroup(studNumber);
	}

	public static int countStudents(String[] languages) {

		// Create a static method called countStudents, which receives an array
		// containing the languages chosen by the candidates. Return the number of
		// candidates who have chosen Java, regardless of how they wrote it (upper/lower
		// case).

		int javaStudentCounter = 0;

		if (languages != null) {
			for (String language : languages) {
				if (language.toLowerCase().contentEquals("java")) {
					javaStudentCounter++;
				}
			}
		}

		return javaStudentCounter;

	}

}