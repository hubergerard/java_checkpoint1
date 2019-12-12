public class Student {

	// TODO hasLegalAge
	public static boolean isLegal(int age) {
		return (age >= 18) ? true : false;
	}

	// TODO getGroup
	public static char giveGroup(int studentNumber) {
		return (studentNumber % 2 == 0) ? 'A' : 'B';
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