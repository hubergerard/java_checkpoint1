public class Student {

    // hasLegalAge
	public static boolean hasLegalAge(int age) {
		return (age >= 18);
	}

    // getGroup
	public static char getGroup(int number) {
		return (number%2) ==0? 'A':'B';
	}

    // TODO countStudents
	public static int countStudents(String[] language) {
		int z = 0; 
		for (int i = 0; i < language.length; i++) {
			z += "JAVA".equals(language[i].toUpperCase())? 1:0;
		}
		return z;
	}
	
	public static void main(String[] args) {
		System.out.println(getGroup(12));
	}

}