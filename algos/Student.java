public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge (int age) {
      if (age >= 18) {
        return (true);
      }
      return (false);
    }

    // TODO getGroup
    public static char getGroup (int number) {
      if (number%2==0) {
      return 'A';
      }
    return 'B';
    }

    // TODO countStudents
    public static int countStudents (String [] language) {
      int count = 0;
        for (String l : language)  {
              if (l.equalsIgnoreCase("java")) {
                count += 1;
              }
        }
      return count;
    }

        /*only for testing
        public static void main (String[] args) {

        System.out.println(hasLegalAge (17) + ", " + hasLegalAge (18)+ ", " + hasLegalAge (-1));
        System.out.println(getGroup (17) + ", " + getGroup (18)+ ", " + getGroup (1113)+ ", " + getGroup (-1));
        String[] students = {"java", "js", "Java", "PHP", "JS", "JAVA", "Java"};
        System.out.println(countStudents(students));

        }
        */
}
