import java.util.Scanner;
public class Pattern {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        //int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
           // for (int j = 0; j<n; j++) {
           for (int j = 1; j < i; j++){

                System.out.print("*");
            
            
                //System.out.print(j);
                
            
            sc.close();    
            }
            System.out.println();


        }
    }

}