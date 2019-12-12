public class Student {
	
    // TODO hasLegalAge
	public static boolean isLegal(int age) {
		if(age >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	//test uses "hasLegalAge" objective is "isLegal"!?
	public static boolean hasLegalAge(int age) {
		return isLegal(age);
	}


    // TODO getGroup
	public static char getGroup(int number) {
		return giveGroup(number);
	}
	
	//test uses "getGroup" objective is "giveGroup"!?
	public static char giveGroup(int number) {
		if(number % 2 == 0) {
			return 'A';
		} else {
			return 'B';
		}
	}
	
    // TODO countStudents
	public static int countStudents(String[] students) {
		int number = 0;
		for (String pick : students) {
			if(pick.equalsIgnoreCase("java")) {
				number++;
			}
		}
		return number;
	}
	
}