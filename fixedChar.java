import java.util.*;

public class fixedChar 
{

    public static void main(String[] args) throws Throwable 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for cases: ");
        int n = sc.nextInt();
        int a = 65;
         
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                   
                System.out.print((char)a);
            }
            System.out.println();
            a++;
        }

    }
}