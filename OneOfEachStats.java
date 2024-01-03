public class OneOfEachStats {
    public static void main(String[] args) {
	int tests = Integer.parseInt(args[0]);
	int seed = Integer.parseInt(args[0]);
	int family2 = 0;
	int family3 = 0;
	int family4 = 0;
	double countC = 0.0 ;
	for (int i=0 ; i<=tests ; i++) {
	boolean boy = false;
	boolean girl = false;
	int count = 0 ;
	 do {
	double RandomGenerator = new Random(seed); 
	countC++ ;
		if ((0.0 < RandomGenerator && RandomGenerator < 0.5)) {
		boy = true ;
		count += 1 ;
	}else {
		girl = true ;
		count += 1 ;
	}
		} while ((boy == false) || (girl == false)) ;
		if (count == 2){
			family2+=1 ;
		} else if (count == 3) {
			family3+=1;
		} else if (count >+4) {
			family4+=1;
		}
	}
	double averageChildren = countC / tests;
	System.out.println("Average: " + averageChildren + "children to get at least one of each gender.") ;
	System.out.println("number of families with 2 children: " + family2);
	System.out.println("number of families with 3 children: " + family3);
	System.out.println("number of families with 4 or more children: " +family4);
	
	if (family2>family3 && family2>family4) {
		System.out.println("The most common number of children is 2.");
		}else if (family3>family2 && family3>family4) {
		System.out.println("The most common number of children is 3.");
			}else if (family4>family2 && family4>family3) {
			System.out.println("The most common number of children is 4.");
			}
}
}