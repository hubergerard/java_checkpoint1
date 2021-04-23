package algos;

public class Factorial {
    public static int facto(int i) {

        if (i == 0 || i == 1) {
            return 1;
        }

        return i * facto (i-1);
    }
}
