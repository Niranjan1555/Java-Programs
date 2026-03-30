
public class gmail {
    public static void main(String[] args) {
        String name = "niranjan@gmail.com";
        String rest = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '@') {
                
                break;
            } 
            else {
                rest = rest+ name.charAt(i);
            }
        }
        System.out.println(rest);
    }
}