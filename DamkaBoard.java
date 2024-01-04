public class DamkaBoard {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
		String row_ev =("* ") ;
		String row_odd =(" *") ;
		for (int cols=0 ; cols < input ; cols++) {
			if (cols % 2 == 0) {
				for (int rows_e=0 ; rows_e < input ; rows_e++) {
				 System.out.print(row_ev );
				}
				System.out.println("");
			}else {
				for (int rows_o=0 ; rows_o < input ; rows_o++) {
				System.out.print(row_odd);
				}
				System.out.println("");
				}
		}
		}			
	}