import java.util.*;

public class StringEx
{
    public static void main(String[] args)
    {  
      //  String message = Greet();
      //  System.out.println(message);

          Scanner in = new Scanner(System.in);
          System.out.println("Enter your Name: ");
          String naam = in.next();
          String personal = myGreet(naam);
          System.out.println(personal);
    } 
 
    public static String myGreet(String name)
    {
        String greeting = "Hello " + name;
        return greeting;
    }

    public static String Greet()
    {
        String greeting = "How are you";
        return greeting;
    }
}