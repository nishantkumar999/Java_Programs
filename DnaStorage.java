import java.util.Scanner;

public class DnaStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String result = "";
             
            for(int i=0;i<n;i+=2)
            {
                char a = s.charAt(i);
                char b = s.charAt(i+1);
              
                if(a=='0' && b=='0'){
                   result+="A";
                }
                if(a=='0' && b=='1'){
                    result+="T";
                }
                if(a=='1' && b=='0'){
                    result+="C";
                }
                if(a=='1' && b=='1'){
                    result+="G";
                }
            }
           System.out.println(result);
        }
    }
}