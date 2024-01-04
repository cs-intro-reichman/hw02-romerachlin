public class Reverse {
public static void main(String[] args) {
	String s = args[0] ;
	String Reverse = ("");
		for (int i = (s.length() - 1) ; 0 <= i ; i--) {
		Reverse = Reverse + (s.charAt(i)) ;
			}
			System.out.println(Reverse);
		int Mid = (Reverse.length() / 2) ;
		char mid = (Reverse.charAt(Mid)) ;
			System.out.println("The middle character is " + mid);
	} 
}