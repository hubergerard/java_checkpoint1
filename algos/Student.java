package algos;

import java.sql.SQLSyntaxErrorException;
import java.util.Locale;
public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge(int age){
        return age<=18?true:false;
    }
    // TODO getGroup
    public static char getGroup (int id){
        return id % 2==0?'A':'B';
    }
    // TODO countStudents
    public static int countStudents(String[] ArrayList){
        int i = 0;
        for(String answer : ArrayList){
            if(answer.toLowerCase().indexOf("java") != -1 ) i++;
        }
        return i;
    }
}