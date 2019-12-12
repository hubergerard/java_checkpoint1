public class Student {

    // TODO hasLegalAge
    static boolean hasLegalAge (int age){
      if (age>=18){
      return true;}
      else {return false;}
    }

    // TODO getGroup
    static char getGroup (int student_number){
      char groupId='A';
      if (student_number % 2==1){groupId='B';}
    return groupId;
    }

    // TODO countStudents
    static int countStudents (String[] languages){
      int javaCandidates=0;
      for (String i : languages){
        i=i.toLowerCase();
        /* check of length because JavaScript must not be counted */
        if (i.length()<6 && i.contains("java")){
          javaCandidates+=1;
         }
      }
      return javaCandidates;
    }


}
