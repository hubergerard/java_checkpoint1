public class Student {

	public static boolean isLegal(int age) {
		return age >= 18;
	}

	public static boolean hasLegalAge(int age) {
		return Student.isLegal(age);
	}
	
	static char giveGroup(int studentNumber) {
		if (studentNumber % 2 == 0) {
			return 'A';
		} else {
			return 'B';
		}
	}
	
	static char getGroup(int studentNumber) {
		return giveGroup(studentNumber);
	}
	
	static int countStudents(String[] languages) {
		int count = 0;
		
		for (String language : languages) {
			if (language.equalsIgnoreCase("java")) {
				count++;
			}
		}
		
		return count;
	}
	
}