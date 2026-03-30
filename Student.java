public class Student {

    String name;
    int age;

    public void display(int age) {
        System.out.println("Age: " + age);
    }

    public void display(String name){
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.display("Niranjan");
        s1.display(19);

        
    }
    
}
