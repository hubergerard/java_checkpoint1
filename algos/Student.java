public class Student {

	// TODO hasLegalAge
	public static boolean hasLegalAge(int age) {

		if (age > 18) {
			return true;
		} else {
			return false;
		}
	}

	// TODO getGroup
	public static char getGroup(int number) {

		if (number % 2 == 0) {
			System.out.println("The number is even.");
			return 'A';
		} else {
			System.out.println("The number is odd.");
			return 'B';
		}
	}

	// TODO countStudents
	public static int countStudents(String[] students) {

		String lowCase = "";
		int number = 0;

		for (int i = 0; i < students.length; i++) {
			lowCase = students[i].toLowerCase();
			if (lowCase.equals("java")) {
				number++;
			}
		}
		return number;
	}

}