public class Perfect {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int sum = 1;
        String divisorString = "1";

        for (int div =2; div < input; div++) {
            if (input % div == 0) {
                sum += div;
               divisorString = divisorString+ " + "+ div ;
			 
            }
        }

        if (sum == input) {
            System.out.println(input + " is a perfect number since " + input + " = " + divisorString);
        } else {
            System.out.println(input + " is not a perfect number");
        }
    }
}