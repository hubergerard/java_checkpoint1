
public class Factorial {

   // TODO
    public static int facto(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return facto(number-1) * number;
    }
}
