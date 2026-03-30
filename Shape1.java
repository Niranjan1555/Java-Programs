public class Shape1 {
    void display() {
        System.out.println("Shape is Loading..");
    }

    public static void main(String[] args) {
        Shape1 s1 = new Shape1();
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();

        s1.display();
        c1.display();
        t1.display();
    }
}

class Circle extends Shape1 {
    void display() {
        System.out.println("Circle is small...");
    }
}

class Triangle extends Shape1 {
    void display() {
        System.out.println("Triangle is Medium...");
    }
}