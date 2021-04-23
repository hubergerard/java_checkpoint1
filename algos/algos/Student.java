package algos;
public class Student {

    // TODO hasLegalAge
	public static boolean hasLegalAge(int age) {
		return age >= 18;
	}


    // TODO getGroup
	public static char getGroup(int i) {
		return i % 2 == 0 ? 'A' : 'B' ;
	}


    // TODO countStudents
	public static int countStudents(String[] students) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].toUpperCase() == "JAVA") {
				count++;
			}
		}
		return count;
	}
}
