import java.util.Scanner;

public class CandyAmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // Your code goes here
            int z = (y-x)*2 + x*1;
            if(x>=y)
            {
                System.out.println(y*1);
            }
            else
            {
                System.out.println(z);
            }
        }
    }
}
