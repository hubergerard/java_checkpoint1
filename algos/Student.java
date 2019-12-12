public class Student {

	// TODO hasLegalAge
	public static boolean hasLegalAge(int age) {
		if (age >= 18)
			return true;
		else
			return false;
	}

	// TODO getGroup
	public static char getGroup(int studentNumber) {
		if ((studentNumber % 2) == 0)
			return 'A';
		else
			return 'B';
	}

	// TODO countStudents
	public static int countStudents(String[] aChoosenLanguage) {
		int anz = 0;
		for (String language : aChoosenLanguage) {

			if (language.toUpperCase().equals("JAVA"))
				anz++;
		}

		return anz;
	}

}