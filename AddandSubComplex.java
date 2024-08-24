//To add and Subtract two complex Numbers, 

 import java.util.*;
import java.lang.*;
import java.io.*;

class Complex{
    int real;
    int imaginary;
    
    public Complex(){
        
    }
    public Complex(int x, int y){
        real = x;
        imaginary = y;
    }

    public void print(){
        System.out.println(real+ "+" +imaginary + "i");
    }
}

public class AddandSubComplex
{
    static Complex add(Complex c1, Complex c2){
        Complex ans = new Complex();
        ans.real = c1.real + c2.real;
        ans.imaginary = c1.imaginary + c2.imaginary;
        return ans;
    }

    static Complex subtract(Complex c1, Complex c2){
        Complex ans = new Complex();
        ans.real = c1.real - c2.real;
        ans.imaginary = c1.imaginary - c2.imaginary;
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Complex c1 = new Complex(6, 6);
        c1.print();

        Complex c2 = new Complex(4, 3);
        c2.print();

        Complex addedComplex = add(c1, c2);
        addedComplex.print();

        Complex subComplex = subtract(c1, c2);
        subComplex.print();
	}
}