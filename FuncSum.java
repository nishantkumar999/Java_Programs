import java.util.*;

public class FuncSum
{
     public static void main(String[] args)
     {
       /*   getSum();*/
    
   /*       int ans = Sum2(); 
            System.out.println(ans);*/

            int ans = sum3(20 , 30);
            System.out.println(ans);
            
      }
       
    // pass the value of numbers when you are caling the method in main()
       
         public static int sum3(int a , int b)
         {
              int sum = a+b;
              return sum;  
         } 

          // return the value 
        /*public static int sum2()
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int n2 = sc.nextInt();
            int sum = n1 + n2;
            return sum;
         }*/
         
         
       public static void getSum()
       {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int n2 = sc.nextInt();
            int sum = n1 + n2;
             
            System.out.println("The sum of n1 and n2 is: "+sum);
       }
}