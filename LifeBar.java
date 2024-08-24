/**/


import java.util.*;
 
public class LifeBar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxLives = 0; //Intitialize max lives to 0.
        int rowIndex = -1; //index initialize with -1.

        for(int i=0; i<n; i++){
            int countLives = 0;// To store the count of '1' in each row.
            for(int j=0; j<m; j++){
                if(arr[i][j] == 1){
                    countLives++;
                }
            }
               //To check if count of '1' is more than max lives.
            if(countLives > maxLives){  
                maxLives = countLives;
                rowIndex = i; // store the index.
            }
             // To check if count is equal to max lives and current i is less than stored index.
            else if(countLives == maxLives && i<rowIndex){
                rowIndex = i;
            }
        }

        System.out.println(rowIndex);
	}
}