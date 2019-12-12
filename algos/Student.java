package algos;

public class Student {

    // TODO hasLegalAge
    public static boolean isLegal (int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
    // TODO getGroup
    public static char giveGroup (int numberStudent){
        if ((numberStudent%2) == 0){
            return 'A';
        }
        else {
            return 'B';
        }
    }
    // TODO countStudents

    public static int countStudents(String[] students){
        String test = "java";
        int counter = 0;
        for (int j = 0; j < students.length; j++){
            if (test.equalsIgnoreCase(students[j])){
                counter++;
            }
        }
        return counter;
    }
}