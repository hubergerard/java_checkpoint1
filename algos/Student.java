public class Student {

    // TODO hasLegalAge

	   public static boolean hasLegalAge(int age)
	    {
	    	 if(age <= 18) {
	    		 return false;
	    	 } else
	    		 return true;
			}


	 	// TODO getGroup
	    public static char getGroup(int id)
	    {
	    	char group  = 'A';
	    	char group2 = 'B';

	    	if(id %2 == 0) {
	    	return group;
	    	} else {
						return group2;
	    	}
	    }
	    // TODO countStudents
	    public static int countStudents(String[] str)
			{
	    	int counter = 0;

	        for (int i = 0; i < str.length; i++) {
						if (str[i].toLowerCase().equals("java")) {
	                   counter++;
	          					}
	       }return counter;
	    }

}
