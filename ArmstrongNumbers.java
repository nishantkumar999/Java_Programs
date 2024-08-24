import java.util.*;

public class ArmstrongNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        
        for (int i = 1; i <= N; i++) 
        {
            if (isArmstrong(i)) 
            {
                System.out.println(i);
            }
        }

    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int num) 
    {
        int originalNum = num;
        int sum = 0;

        while (num > 0) 
        {
            int rem = num % 10;
            sum += rem*rem*rem;
            num /= 10;
        }

        return sum == originalNum;
    }
}