//Student.java
public class Student {
    // Variables (Private)
    private String name;
    private int id;
    private double cgpa;
  
    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
  
    // Getter Methods 
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//MyClass.java
public class MyClass {

    public static void main(String[] args) {

        // Create Student object
        Student s1 = new Student();
      
        // Setter Methods
        s1.setName("Tabassum");
        s1.setId(461);
        s1.setCgpa(3.83);
      
        // Getter Methods
        
        System.out.println("Name : " + s1.getName());
        System.out.println("ID   : " + s1.getId());
        System.out.println("CGPA : " + s1.getCgpa());
    }
}

