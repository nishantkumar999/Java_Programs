import java.util.*;

public class DigitFrequency {

	static int FrequencyofDigits(long n, int d) {
       
        int count=0;
        while(n>0){
            if(n%10==d){
                count++;
             }
            n=n/10;
        }
        return count;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        long n = sc.nextLong();
        System.out.println("Enter the Digit to find Frequency: ");
        int d = sc.nextInt();
        System.out.println("The Frequency of this Digit is: ");
        System.out.println(FrequencyofDigits(n, d));
    }
}