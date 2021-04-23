package algos;

public class Factorial {
   private int n;

   static int facto(int n){
       if (n<=1){
           return 1;
       }
       else {
           return n*facto(n-1);
       }
   }
}
