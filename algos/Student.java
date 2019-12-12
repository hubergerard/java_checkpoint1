public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge(int age) {
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

    // TODO getGroup
    public static char getGroup(int number){
        
        if (number % 2 == 0){
            return 'A';
        }
        else {
            return 'B';
        }
    }

    // TODO countStudents
    public static int countStudents(String [] arg){
        int counter = 0;
        int i;
        String wort = "";
    
        for (i = 0; i < arg.length; i++){
            wort = arg[i].toLowerCase();

            if (wort.equals ("java")){
                counter++;
            }
        }
        return counter;
    }
}