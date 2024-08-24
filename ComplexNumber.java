//To show and print Complex Number.

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

public class ComplexNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Complex c1 = new Complex(3, 5);
        c1.print();
	}
}