

public class BasicEx {

        int age;
        String name;
        public void getInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

        public static void main(String[] args){
            BasicEx s1 = new BasicEx();
            s1.name = "Niranjan";
            s1.age = 19;
            s1.getInfo();
        }
    }
