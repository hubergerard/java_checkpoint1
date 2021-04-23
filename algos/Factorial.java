

public class Factorial {

    public static int facto(int nb) {
        if (nb == 0 || nb == 1) {
            return 1;
        }
        return nb * facto(nb - 1);
    }
}
