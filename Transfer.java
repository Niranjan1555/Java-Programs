import java.util.*;

public class Transfer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int numbers[][] = new int[rows][columns];
           for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                numbers[i][j] = sc.nextInt();
            

            }
        }
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(numbers[j][i] + " ");

            }
            System.out.println();
        }
        

    }
}
