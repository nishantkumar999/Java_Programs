import java.util.*;

public class TestTemp {
    public static void main(String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        double c = sc.nextDouble();
        double tempinCelsius = ((c*9)/5)+32; 
        double F = tempinCelsius;
        System.out.printf("%.6f",F); //Temperature in Fahernhit upto 6 decimals. 
        
        // System.out.printf("%.3f", F");
    }
}
 
//.3f and .6f are format specifier.