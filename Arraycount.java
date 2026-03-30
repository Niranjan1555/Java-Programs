public class Arraycount {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,5};
        int n = arr.length;
        int count = 0;

        for(int i = 0; i<n;i++){
            if(arr[i] % 2 == 0 ){
                count ++;
            }

            System.out.println(" " + count);
        }
        

    }
    
}


