public class Student {

    // TODO hasLegalAge
	public static boolean hasLegalAge (int age){
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
		
	} 

    // TODO getGroup
	public static char getGroup (int studentNr){
		
		if (studentNr % 2 == 0) {
			char group = 'A';
			return group;
		} else {
			char group = 'B';
			return group;
		}	       
        
	}
    // TODO countStudents
	public static int countStudents (String[] antwort) {
		
		int java = 0;
		for (int i = 0; i < antwort.length; i++) {
			if (antwort[i] == "JAVA" ||  antwort[i] == "Java" ||  antwort[i] == "java") {
				java = java +1;
			
			} 
		}
		return java;
	}

}