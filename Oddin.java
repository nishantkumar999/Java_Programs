/*Odd Numbers
You have to keep taking integers as input until you get an odd number as input. Your output will be N, which represents the number of numbers you had to take as input uptill encountering an odd number.*/
/*------------------------------------------------------------------------------*/
import java.util.*;
  
class Oddin {
	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
		 
            int count = 0;   
            while (true) {
               System.out.print("Enter an integer: ");
               int num = sc.nextInt();
               count++;

               if (num % 2 != 0) {
                 System.out.println("Odd number encountered!");
                 break;
               }
           }

        System.out.println("Total numbers taken as input: " + count);
    }
}