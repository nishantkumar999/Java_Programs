import java.util.Scanner;

public class TestCon
{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            
            if(num>0){
                  System.out.println("The Number is Positive");
            }
            
            else if(num<0){
                  System.out.println("The Number is Negative");
            }
           
            else{
                  System.out.println("The Number is Zero" );
            }

      }

}