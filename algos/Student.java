public class Student {

    // TODO hasLegalAge

 public static boolean isLegal(int age)
    {
    	 if(age < 18) {
    		 return false;
    				} 
    	return true;
		}

    // TODO getGroup
  public static char giveGroup(int id)
    {
    	char group  =  'a';
    	char group2 = 'b';
    	
    if(id %2 == 0) {
    	return group;
    }else 
		return group2;
	}


    // TODO countStudents
	
	  public static int countStudents(int id)
    { 
    	String count = new String[];
    
    	
    for (int i = 0; i < count.length; i++) {  
    	//System.out.println(count.length);
    	return count[i];
    	}
    	
    }

}
