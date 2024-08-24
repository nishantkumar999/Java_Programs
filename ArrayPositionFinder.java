/*Problem 1
Given below is a 2D array of size 3x3.
{1 4 7
 2 5 8
 3 6 9}
Write a Java Code that will take an element's value as input, and print the position of that element in the 2D array (0-based indexing) in the format i j (where “i” is the row number and “j” is the column number).

Input Format:First line contains an integer.*/

import java.util.*;

public class ArrayPositionFinder {
    public static void main(String[] args) {
        // Example 2D array.
        Scanner sc = new Scanner(System.in);
        int[][] array = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        int targetElement = sc.nextInt(); /* Replace with the element you want to                                                  find*/

        // Call the method to find the position.
        findElementPosition(array, targetElement);
    }

    public static void findElementPosition(int[][] array, int target) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == target) {
                    System.out.println(i + " " + j);
                    return; // Exit the method once found.
                }
            }
        }

        System.out.println(target);
    }
}  
        