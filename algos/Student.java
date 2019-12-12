public class Student {

    // TODO hasLegalAge
	public static boolean hasLegalAge(int age){
		if (age >=18) {
			return true;
		}
		else {return false;}
	}

    // TODO getGroup
	public static char giveGroup(int number) {
		if (number%2 == 0) {
			return 'A';
		}
		else {return 'B';}
	}

    // TODO countStudents
	public static int countStudents(String [] arr) {
		int counter= 0;
		
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = arr[i].toLowerCase(); 
			if(arr[i].toLowerCase().equals("java")) {
				counter++;
			}
		}	
		return counter;
	}

}