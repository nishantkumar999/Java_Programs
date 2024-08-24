//Input with DataInputStream : Calculator Program

import java.io.*;

class InterestCalculator
{
     public static void main(String args[])
     {
         Float principalAmount = new Float(0);
         Float rateOfInterest = new Float(0);
         int numberOfYears = 0;

         DataInputStream d = new DataInputStream(in);
         BufferedReader d = new BufferedReader(new InputStreamReader(in)); 
         String tempString;
         System.out.println("Enter Principal Amount: ");
         System.out.flush();
         tempString = BufferedReader.readLine();
         principalAmount = Float.valueOf(tempString);
         System.out.println("Enter Rate of Interest: ");
         System.out.flush();
         tempString = BufferedReader.readLine();
         rateOfInterest = Float.valueOf(tempString);
         System.out.println("Enter Number of Years: ");
         System.out.flush();
         tempString = BufferedReader.readLine();
         numberOfYears = Integer.parseInt(tempString);

         float interestTotal = principalAmount*rateOfInterest*numberOfYears;
         System.out.println("Total Interest= "+interestTotal);

     } 
}

