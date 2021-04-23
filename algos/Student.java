package algos;

import java.sql.SQLSyntaxErrorException;
import java.util.Locale;

public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge(int age){
        return age >=18 ? true : false;
    }

    // TODO getGroup
    public static char getGroup(int studentNumber){
        return (studentNumber%2 == 0) ? 'A' : 'B';
    }

    // TODO countStudents
    public static int countStudents(String[] languages){
        int pickedJava = 0;
        for(String lang : languages){
            if(lang.toLowerCase().indexOf("java") != -1 ) pickedJava++;
        }
        return pickedJava;
    }

}