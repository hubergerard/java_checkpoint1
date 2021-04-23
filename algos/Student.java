import java.util.Locale;

public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }
    // TODO getGroup
    public static char getGroup(int number) {
        if (number % 2 == 0) {
            System.out.println("even : "+number);
            return 'A';
        } else {
            System.out.println("odd : "+number);
            return 'B';
        }
    }
    // TODO countStudents
    public static int countStudents(String[] students) {
        int count = 0;
        String capitalize = "";
        for (String choiceStudent : students) {
            capitalize = choiceStudent.toLowerCase().substring(0,1).toUpperCase() + choiceStudent.toLowerCase().substring(1);
            if (capitalize.equals("Java")) {
                count++;
            }
        }

        return count;
    }
}