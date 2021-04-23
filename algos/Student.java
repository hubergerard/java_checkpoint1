public class Student {

    public static boolean hasLegalAge(int age) {
        return age >= 18;
    }

    public static char getGroup(int nb) {
        if (nb % 2 == 0) {
            return 'A';
        }
        return 'B';
    }

    public static int countStudents(String[] aStudents) {
        int nb = 0;
        for (String stud : aStudents) {
            if (stud.toLowerCase().equals("java")) {
                nb++;
            }
        }
        return nb;
    }


}