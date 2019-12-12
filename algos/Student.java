public class Student {

    // TODO hasLegalAge
	public static boolean hasLegalAge(int age) {
		return age >= 18 ? true : false;
	}

    // TODO getGroup
	public static char getGroup(int studentId) {
		return studentId % 2 == 0 ? 'A' : 'B';
	}
    // TODO countStudents
	public static int countStudents(String[] students) {
		int counter = 0;
		for(String student:students) {
			student = student.toLowerCase();
			if(student.equals("java")){
				counter++;
			}
		}
		return counter;
	}

}