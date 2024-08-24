public class TypeCast
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        double v1 = 10.5;
        double v2 = 12.5;
        double v3 = 12.15;
        double average = (v1+v2+v3)/3;
        int value = (int)average;        //Typeacsting
        System.out.println(value);
	}
}