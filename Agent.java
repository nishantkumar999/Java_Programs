import java.util.*;

public class Agent
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int age = scanner.nextInt();
	    float f = scanner.nextFloat();
	    long d = scanner.nextLong();
	    String agentName = scanner.nextLine();
	
		System.out.println("Age is: "+age);
		System.out.println("Float is: "+f);
		System.out.println("Long is: "+d);
		System.out.println("Hi my name is Agent "+agentName);
	}
}

 