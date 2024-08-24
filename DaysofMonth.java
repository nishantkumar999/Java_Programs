import java.util.*;

public class DaysofMonth {
    public static void main(String[] args) throws Throwable {
          Scanner sc = new Scanner(System.in);
          int M = sc.nextInt();
	  int y = sc.nextInt();
	     
	  if(y%4==0 && y%100!=0 )
	  {
            if(M==1||M==3||M==5||M==7||M==8||M==10||M==12)
            {
            System.out.println(31);
            }
            else if(M==4||M==6||M==9||M==11)
            {
            System.out.println(30);
            }
            else
            {
            System.out.println(29);
            }
             
         }
        
    }
}