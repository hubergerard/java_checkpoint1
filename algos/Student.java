public class Student {

    // TODO hasLegalAge

	   public static boolean isLegal(int age)
	    {
	    	 if(age < 18) {
	    		 return false;
	    	 } else	 
	    		 return true;
		}
	 	
	    public static char giveGroup(int id)
	    {
	    	char group  = 'a';
	    	char group2 = 'b';
	    	
	    	if(id %2 == 0) {
	    	return group;
	    	} else {
			return group2;
	    	}	
	    }
	    
	    public static int countStudents(String[] str)
	    { 
	    	int counter = 0;
	        for (int i = 0; i < str.length; i++) {
	          if (str[i].toLowerCase() != null) {
	                   counter++;
	          	}  
	        }return counter;
	    }

}
