// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Animal a;  // reference of parent class

        a = new Dog();
        a.sound();  // Dog version

        a = new Cat();
        a.sound();  // Cat version
    }
}
