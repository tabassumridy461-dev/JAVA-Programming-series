// Class with private variables (data hiding)
class Student {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // setting values using setter
        s.setName("Ridy");
        s.setAge(20);

        // getting values using getter
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
