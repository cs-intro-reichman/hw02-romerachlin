public class Perfect {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int sum = 0;
        String divisorString = "";

        for (int div = 1; div < input; div++) {
            if (input % div == 0) {
                sum += div;
                divisorString += div + (div != input - 1 ? " + " : "");
            }
        }

        if (sum == input) {
            System.out.println(input + " is a perfect number since " + input + " = " + divisorString);
        } else {
            System.out.println(input + " is not a perfect number");
        }
    }
}