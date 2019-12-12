public class Student

public Student
private String name;
private int age;
private boolean adult;


//getters
public String getName() {
    return name;
}

public int getAge (){
    return age;
  }

  public boolean isAdult(){
      return this.adult;
}
//setters
public void setName(String name) {
    this.name = name;
}

public void setAge(int age) {
    this.age = age;
}

public void setAdult(boolean adult) {
      this.adult = true;
}

public booelan isLegal() {

  if (this.age >=18){
  return adult;
  }else{
  System.out.println("Kein Zutritt für Minderjährige!")
  }
}



public static void main(String[] args) {

Student Fritz = new Student ("Fritz", 12, false);
Student Rolf = new Student ("Rolf", 21, true);

System.out.println(());
System.out.println(());
