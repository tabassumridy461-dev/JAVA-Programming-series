//Employee.java
public class Employee {
    // Variables (Private)
    private String name;
    private int id;
    private double salary;
  
    // Parameterized Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter Methods
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
}

//MyClass.java
public class MyClass {

    public static void main(String[] args) {

        // Create Employee object using constructor
        Employee emp1 = new Employee("Tabassum", 461, 50000);

        // Display values using Getter Methods
        System.out.println("Name   : " + emp1.getName());
        System.out.println("ID     : " + emp1.getId());
        System.out.println("Salary : " + emp1.getSalary());

        // Update values using Setter Methods
        emp1.setName("Ridy");
        emp1.setId(462);
        emp1.setSalary(60000);

        System.out.println("\nAfter Updating:");

        // Display updated values
        System.out.println("Name   : " + emp1.getName());
        System.out.println("ID     : " + emp1.getId());
        System.out.println("Salary : " + emp1.getSalary());
    }
}
