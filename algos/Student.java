public class Student {

	// TODO hasLegalAge
	static boolean hasLegalAge(int age) {
		if (age >= 18)
			return true;
		else
			return false;
	}

	// TODO getGroup
	static char getGroup(int number) {
		if ((number % 2) == 0)
			return 'A';
		else
			return 'B';
	}

	// TODO countStudents
	static int countStudents(String[] languages) {
		if (languages == null)
			return 0;
		int count = 0;
		for (int i = 0; i < languages.length; i++) {
			if (languages[i].toLowerCase().equals("java"))
				count++;
		}
		return count;
	}

}
