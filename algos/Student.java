import java.util.ArrayList;

public class Student {
	
	public static void main (String[] args)   {
		
		// attributs
	    String name;
	    int age;
	    int nr;
				
		
//	    ArrayList <Student> student = new ArrayList<>();
    	
//     	Student hans = new Student ("Hans Meier", 34, 7);
//    	Student josef = new Student ("Josef Müller ", 15, 14);
//    	Student karl = new Student ("Karl Noll", 23, 5);
//    	Student michael= new Student ("Michael Abt", 15, 9);
//		
//		   public Student(String name, int age, int nr) {
//		        this.name = name;
//		        this.age = age;
//		        this.nr = nr;
//		        }

    
	    // TODO hasLegalAge
		   
	    public boolean student.hasLegalAge(int age)   {
			   
			   if (age >= 18)   {
					return 
							true;
			   		}
			   
			   else   {
				   return 
						   false; 
				   }
	    }	   
		   		   
			   
    // TODO getGroup
	    
	    public char giveGroup (int no)   {
	    	
	    	if (no%2 == 0 )   {
	    		return 'B';
	    		}
	    		
	    	else   {
	    		return 'A';
	    		}	
	    }
		    

     //TODO countStudents
	    
	    public int countStudents(String[] lang)   {
	    	
	    	int co = 0;
	    	
	    	
	      	for (int i = 0; lang.length; i++)   {
	    		
	    		String a = lang[i].toLowerCase();
	    		
	    		if (a == "java")   {
	    			co++;
	    		}
	      	    	
	    		return co;
	    	}
 		
    	}
 	}
}