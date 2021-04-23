package algos;

public class Student {

    // TODO hasLegalAge
	public static boolean islegal(int age) {
		if (age>=18) {
			return true; 
		}else {
			return false;
		}
	}	

    // TODO getGroup
	public static char getGroup(int number) {
		if (number%2==0) {
			return 'A';
		}else {
			return 'B';
		}
			
	}
	//  String[] students = {"java", "js", "Java", "PHP", "JS", "JAVA", "Java"};
    // TODO countStudents
	public static int countStudents(String[] students ) {
		int cptLangue = 0;
		for (String langue : students) {
			if (langue.toLowerCase().equals("java")) {
			   cptLangue++;	
			}
		}
		return cptLangue;
	}

}