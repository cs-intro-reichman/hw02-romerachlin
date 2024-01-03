public class InOrder {
    public static void main(String[] args) {
        int prev = -1;
        do {
            int next = (int) (Math.random() * 10);
            
            if (next >= prev) {
                System.out.print(next + " ");
                prev = next;
            } else {
                break;
            }
        } while (true);
    }
}