import java.util.Scanner;

public class ReversePattern {
    public static void main(String [] args) {
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();
       
        for (int i = 0; i < m; i++) {
           // for (int j = 0; j<n; j++) {
           for (int j = 0; j < (m - i); j++){
            System.out.print(".");
           }
           for(int j = 0; j < i; j++){
            System.out.print("*");
           }
            
            
                //System.out.print(j);
                 System.out.println();
                
                
        Sc.close();
            }
           

        }

        
}