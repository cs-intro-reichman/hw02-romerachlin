public class Divisors {
public static void main(String[] args) {
	int in = Integer.parseInt(args[0]);
	for (int i = 1 ; i <= in ; i++) {
		if (in % i == 0) {
		System.out.println(i) ;
		}
	}
}
}

	