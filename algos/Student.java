public class Student {

int age;
int stud_id;
boolean legalAge = true;

public static boolean hasLegalAge(int age) {
    if(age>=18){
    return true;
    }else{
    System.out.println ("Du bist zu jung.");
    }
    return false;
  }
// TODO getGroup
  public static char giveGroup (int stud_id){
      if(stud_id%2 ==0){
      return 'A';
    }else{
      return 'B';
  }

}
// TODO countStudents
public static int main(String[] args) {

String input="";
int[]numberStud = {};
int count;

for (int k=0; k < numberStud.length; k++){
  if(input.equals ("Java")|| input.equals("JAVA")|| input.equals("java")){
    count += count;
  }else{

  }
  return count;
}

}
}
