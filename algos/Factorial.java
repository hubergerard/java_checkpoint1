
public class Factorial {

	public static int facto(int n) {
		
		if (n == 1 || n == 0 ) {
			return 1;
		} else {
			return ( n * facto(n-1) ); 
		}
	}
}
