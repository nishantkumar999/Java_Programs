import java.util.*;

 
public class Equal{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        if(a==10 || b==10)
        {
            System.out.println("Yes");
        }
        else if((a+b)==10)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
		 
		 
	}
}