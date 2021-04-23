package algos;
import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.*;

public class Student {

    private int age;
    private int id;
    private String [] myArraylanguage;

    public Student(String[] myArraylanguage) {
        this.myArraylanguage = myArraylanguage;
    }
    public Student(int age, int id) {
        this.age = age;
        this.id=id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // TODO hasLegalAge
     static boolean hasLegalAge(int age) {
        if (age>=18){
            return true;
        }
        else return false;
    }
    // TODO getGroup
    static char getGroup(int id){
          if (id % 2==0){
              return 'A';
            }
        else{
             return 'B';
        }
    }
    // TODO countStudents
    static int countStudents(String[] myArraylanguage){
        int i=0;
        for (String answer:myArraylanguage){
            if (answer.toLowerCase().indexOf("java") != -1){
                i++;
            }
        }
       return i;
    }
}