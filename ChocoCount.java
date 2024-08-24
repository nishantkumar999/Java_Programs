import java.util.Scanner;

public class ChocoCount 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        //for(int i=0;i<t;i++)
         while(t-->0)
         {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            int ch = (x*5 + y*10)/z;
            System.out.println(ch);
             
         } 
    }
}