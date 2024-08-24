import java.util.Scanner;

public class Grad {
    public static void main(String[] args) {
       // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>90){
            System.out.println("Excellent");
        }
        else if(N>80 ){
            System.out.println("Good");
        }
        else if(N>70 ){
            System.out.println("Fair");
        }
        else if(N>60 ){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Expectations");
        }
        
    }
}