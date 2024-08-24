/* Displays the weekday between 1 and 7
Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.*/

import java.util.*;
 
public class Weekday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n =  sc.nextInt();

        switch(n){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
	}
}