// Parent Class
class Animal {

    String name = "Dog"; // এখানে Animal class-এর একটি Variable আছে।

    public void eat() {
        System.out.println("Animal is eating.");
    }

}

// Child Class
class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking.");
    }

}

// Main Class
public class Main {

    public static void main(String[] args) {

        Dog d = new Dog(); // Dog-এর Object তৈরি হলো।

        System.out.println(d.name); // Parent Variable 
/* name কিন্তু Dog-এর ভিতরে নেই।
তবুও Output আসছে কারণ Dog Animal থেকে Inherit করেছে। */
      
        d.eat();    // Parent Method

        d.bark();   // Child Method

    }

}
