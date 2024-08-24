import java.util.*;

public class VerifyCube{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        
        long sum = (a+b)*(a+b)*(a+b);
        long v = a*a*a ; 
        long e = b*b*b;
        long i = 3*a*a*b; 
        long f = 3*a*b*b;
        long cube = v+e+i+f;
        System.out.println(sum);
        System.out.println(cube);
        
        if(sum==cube){
            System.out.println("VERIFIED");
        }
        else{
            System.out.println("NOT VERIFIED");
        }
 
    }
}