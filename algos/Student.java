public class Student {

	public static boolean hasLegalAge(int age) {
		return age < 18 ? false : true;
	}

	public static char getGroup(int number) {
		return (number % 2 == 0) ? 'A' : 'B';
	}

	public static int countStudents(String[] languages) {
		int result = 0;
		for (String lang : languages) {
			if (lang.equalsIgnoreCase("java"))
				result++;
		}
		return result;
	}

}