import java.util.Scanner;

public class loginPageNetFlix
{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           boolean isLoggedIN = sc.nextBoolean();
           
           if(isLoggedIN == true)
           {
                 System.out.println("You Logged In");
                   
                 boolean isSubscribed = sc.nextBoolean();
                 if(isSubscribed == true){
                     System.out.println("You Have Active Subscription");
                 }
                 else{ System.out.println("You Have Not Active Subscription");
                 }
           }
           else{
               System.out.println("Sign Up");
           }
                       
           
      }

}