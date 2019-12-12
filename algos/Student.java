public class Student {

// TODO hasLegalAge
public static boolean hasLegalAge (int age) {
if (age>18) { return true;}
else
{return false;}
}
    // TODO getGroup

public static char getGroup (int number) {
int i=number%2;
if (i==0)
{return 'A';}
else
{return 'B';}
}
    // TODO countStudents

public static int countStudents (String [] languages) {
int anzahlEintrage = languages.length;
int j=0; // Anzahl der Java-Einträge
String kleinbuchstaben = "";
for (int i=0; i<anzahlEintrage; i++) {
kleinbuchstaben=languages[i].toLowerCase​();
if (kleinbuchstaben.equals("java"))
{j=j+1;}
}

return j;


}






}
