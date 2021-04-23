package algos;

public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge(int i) {
        return i >= 18 ? true : false;
    }

    // TODO getGroup
    public static char getGroup(int i) {
        return (i % 2) == 0 ? 'A' : 'B';
    }

    // TODO countStudents
    public static int countStudents(String[] students) {
        int cpt = 0;
        for (String student : students){
            if (student.toLowerCase().contains("java") == true)
            {
                cpt++;
            }
        }
        return cpt;
    }

}