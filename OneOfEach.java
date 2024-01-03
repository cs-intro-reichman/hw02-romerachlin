public class OneofEach {
    public static void main(String[] args) {
	boolean boy = false;
	boolean girl = false;
	int count = 0 ;
	
	 do {
	double x = (Math.random()) ;
	count += 1 ;
	if ((0.0 < x && x < 0.5)) {
		boy = true ;
		System.out.print ("b ") ;
	}else {
		girl = true ;
		System.out.print ("g ") ;
	}
		} while ((boy == false) || (girl == false)) ;
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children.");
	 }
}