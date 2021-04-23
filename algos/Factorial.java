package algos;

public class Factorial {
   // TODO
    public static int facto(int number){
        if(number == 0 || number == 1) {
            return 1;
        } else {
            return number*facto(number-1);
        }
    }
}
