public class Parent {
    void eat() {
        System.out.println("Eating...");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.eat();

        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

class Dog extends Parent {
    void bark() {
        System.out.println("Barking");
    }
}