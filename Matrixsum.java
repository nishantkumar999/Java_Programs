/* Problem 
Given a matrix of size n x m. Your task is to find sum of all the elements in the matrix.

Input Format:First line contains two space seprated integers n and m.

Next n lines contains m space seprated integers denoting the elements in the matrix.*/


import java.util.*;

public class Matrixsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println(sum);
    }
}