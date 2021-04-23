public class Student {

	public static boolean hasLegalAge(int age) {
		 if (age >= 18) {
			 return true;
		 } else {
			 return false;
		 }
	}
    // TODO getGroup

	public static char getGroup(int numberStudent) {
		
		char group;
		if (numberStudent % 2 == 0) {
			group = 'A';
		} else {
			group = 'B';
		}
		return group;

	}

	public static int countStudents(String[] students) {
		
		int nb = 0;
		String java = "java";
		for (int i =0; i < students.length ; i++) {
			if (java.equals(students[i].toLowerCase()) ) {
				nb++;
			} 
		}
		System.out.println(nb);
		return nb;
	}


}