public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge (int age) {
    	return age >= 18 ? true : false;
    }

    // TODO getGroup
    public static char getGroup (int number) {
    	return number % 2 == 0 ? 'A' : 'B';
    }
    // TODO countStudents
    public static int countStudents (String[] lang) {
    	int count = 0;
		for (String l : lang) {
			if (l.equalsIgnoreCase("java")) count++;
		}
    	return count;
    }

}