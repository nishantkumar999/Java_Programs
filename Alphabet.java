import java.util.*;

public class Alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
           for(int i=1;i<=5;i=i+1){
              for(int j=1;j<=i;j=j+1){
                   char c = (char)(64+j);
                   System.out.print(c);
               }
               System.out.println();
           }

        
	}
}