import java.util.Scanner;

public class EqualorNot {
    public static void main(String[] args) {
        //write code here
         Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
            sc.close();
	    if(a==b && b==c && c==d && d==a)
	    {
	        System.out.println("1");
	    }
	    else{
	        System.out.println("0");
	    }
        
    }
}