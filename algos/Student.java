public class Student {

   
      public static boolean hasLegalAge(int age){
 	 if(age<18){
		 return false;
	 }
	 else{
		 return true;
		}
	}       
	// TODO hasLegalAge



	public static char getGroup (int number){
	  if(number%2 == 0){
	   return 'A';
	   }	   
	 else{
          return 'B';
	 }
	}

    // TODO getGroup


	public static int countStudents (String [] array){
	 
		int count = 0;

		for(int i=0; i<array.length;i++){
		  array[i] = array[i].toLowerCase();
		  if(array[i].equals ("java")){
			count+=1;
		}

	}    

	return count;
    // TODO countStudents

}
}
