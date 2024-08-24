import java.util.*;

public class LeapYear {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

         
         if(y%400==0){
             System.out.println(1);
         }
        else if(y%100==0){
            System.out.println(0);
        }
        else if(y%4==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
       
    }
}