public class Shape {
    void display(){
        System.out.println("Select any shape...");
    }
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s2 = new Square();
        s.display();
        c.display();
        t.display();
        s2.display();

        
    }


}

class Circle extends Shape{
    void display(){
        System.out.println("Circle is Perfect...");
    }
}

class Triangle extends Circle{
    void display(){
        System.out.println("Triangle is extending Circle...");
    }
}

class Square extends Triangle{
    void display(){
        System.out.println("Square is extending Square...");
    }
}



