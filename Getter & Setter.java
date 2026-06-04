class Student {
    // Private data member
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ridy");      // Set value
        System.out.println(s.getName()); // Get value
    }
}
