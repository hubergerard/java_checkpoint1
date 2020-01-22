public class Student {

    // TODO hasLegalAge
	public static boolean hasLegalAge(int age) {
    	if (age >= 18) {
    		System.out.println("Ist alt genug.");
    		return true;
    	} else {
    		System.out.println("Ist noch zu jung.");
    		return false;
    	}
    }
    
    // TODO getGroup
    public static char getGroup(int studentNumber) {
    	if (studentNumber % 2 == 0) {
    		System.out.println("A");
    		return 'A';
    	} else {
    		System.out.println("B");
    		return 'B';
    	}
    }
    
    // TODO countStudents
    public static int countStudents(String[] languages) {
    	int counter = 0;
    	for (String i : languages) {
    		if(i.toLowerCase().equals("java")) {
    			counter++;
    		}
    	}
    	System.out.println(counter);
    	return counter;
    }
	
    // Manual and visible testing
    public static void main(String[] args) {
	System.out.println("Manual testing:");
	System.out.println("-------------");
	System.out.println("-------------");
	hasLegalAge(17);
	hasLegalAge(18);
	hasLegalAge(19);
	System.out.println("-------------");
	getGroup(2);
	getGroup(5);
	getGroup(14);
	System.out.println("-------------");
	String[] myList = {"JaVa", "Python", "javA", "JAVA", "C++"};
	countStudents(myList);
	}
    	
}
