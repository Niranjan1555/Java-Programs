public class String2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("tony");
        sb.insert(0, 's');
        sb.delete(5,'s');
        sb.append("!");
        
        System.out.println(sb);
        System.out.println(sb.length());
        

    }
}