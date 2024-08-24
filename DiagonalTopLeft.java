/*Java implementation to return
// an array of its anti-diagonals
// when an N*N square matrix is given
print the element from top left corner in bottom left direction upto bottom right corner.*/


import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalTopLeft {
     
 public static void main(String args[])
	{

		// matrix initialisation
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                A[i][j] = sc.nextInt();
        }

		// For each column start row is 0
		for (int col = 0; col < N; col++) {

			int startcol = col, startrow = 0;

			while (startcol >= 0 && startrow < N) {

				System.out.print(A[startrow][startcol]
								+ " ");

				startcol--;

				startrow++;
			}
			System.out.println();
		}

		// For each row start column is N-1
		for (int row = 1; row < N; row++) {
			int startrow = row, startcol = N - 1;

			while (startrow < N && startcol >= 0) {
				System.out.print(A[startrow][startcol]
								+ " ");

				startcol--;

				startrow++;
			}
			System.out.println();
		}

        
	}
}