/* Calculate Speed in Mps, Kph, Mph
Write a Java program to display the speed, in meters per second, kilometers per hour and miles per hour.

Assuming :1 mile = 1609 meters

Input Format
User Input : Distance (in meters) and the time was taken as three numbers: hours, minutes, seconds.*/

import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        float hr = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();

        float timeSeconds = (hr * 3600) + (min * 60) + sec;
        float mps = distance / timeSeconds;
        float kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        float mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);

        scanner.close();
    }
}
