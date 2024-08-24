import java.util.*;

public class GstCalculate 
{
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
         
        if(n<=5000)
        {
            double Gst = (n*18)/100;
            System.out.printf("%.3f",Gst);
        }
        else if(n>5000 && n<=10000)
        {
            double g = (n*20)/100;
            System.out.printf("%.3f",g);
        }
        else if(n>10000 && n<=20000)
        {
            double Gs = (n*25)/100;
            System.out.printf("%.3f",Gs);
        }
        else
        {
            double t = (n*28)/100;
            System.out.printf("%.3f",t);
        }
 
        
    }
}