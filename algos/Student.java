public class Student {

	// TODO hasLegalAge
	public static boolean hasLegalAge(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

	// TODO getGroup
	public static char getGroup(int number) {
		if (number % 2 == 0) {
			return 'A';
		} else {
			return 'B';
		}
	}

	// TODO countStudents
	public static int countStudents(String[] language) {
		int counter = 0;

		for (int i = 0; i < language.length; i++) {

			if (language[i].equalsIgnoreCase("Java")) {
				counter++;
			}
		}
		return counter;
	}

}