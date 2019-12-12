package algos;

public class Student {

	static boolean isLegal(int age) {
		return age >= 18;
	}

	static char giveGroup(int number) {
		return number % 2 == 0 ? 'A' : 'B';
	}

	static int countStudents(String[] languages) {
		int i = 0;
		for (String language : languages)
			if (language.toLowerCase().contentEquals("java"))
				i++;
		return i;
	}
	
}