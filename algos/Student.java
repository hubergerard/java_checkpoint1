public class Student {

	// TODO hasLegalAge
	public static boolean isLegal(int age) {
		return (age >= 18) ? true : false;
	}

	// mapping method for different JUNIT-signature
	public static boolean hasLegalAge(int age) {
		return isLegal(age);
	}

	// TODO getGroup
	public static char giveGroup(int studentNumber) {
		return (studentNumber % 2 == 0) ? 'A' : 'B';
	}

	// mapping method for different JUNIT-signature
	public static char getGroup(int studentNumber) {
		return giveGroup(studentNumber);
	}

	// TODO countStudents
	public static int countStudents(String[] studentSurvey) {
		int studentCount = 0;

		if (studentSurvey != null) {
			for (String studentAnswer : studentSurvey) {
				if (studentAnswer.equalsIgnoreCase("java")) {
					studentCount++;
				}
			}
		}
		return studentCount;
	}
}