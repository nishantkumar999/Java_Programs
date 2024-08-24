import java.util.*;

class Solution {
    public void markStudents( int [] marks, int thres) {
        for(int i=0; i<marks.length; i++){
            if(marks[i] > thres){
                System.out.print("pass"+" ");
            }
            else{
                System.out.print("fail"+" ");
            }
        }
    }
}

public class GradeStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int[n];
        for (int i = 0; i < n; i++)
        marks[i] = sc.nextInt();
        int thres = sc.nextInt();
        Solution Obj = new Solution();
        Obj.markStudents(marks, thres);

        sc.close();
    }
}