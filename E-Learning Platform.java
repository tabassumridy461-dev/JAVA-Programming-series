/* Project Structure
ELearningPlatform
│
├── Main.java
├── QuizActions.java
├── User.java
├── Student.java
├── Instructor.java
└── Quiz.java */

//1. QuizActions.java
// Interface

public interface QuizActions {

    void startQuiz();

    void submitQuiz();

}

//2. User.java
// Abstract Class

public abstract class User {

    // Variable
    String name;

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Abstract Method
    abstract void displayInfo();

}

//3. Student.java
// Student Class

public class Student extends User {

    // Constructor
    public Student(String name) {
        super(name);
    }

    // Method Overriding
    @Override
    void displayInfo() {

        System.out.println("----- Student Information -----");
        System.out.println("Name : " + name);
        System.out.println("Role : Student");
        System.out.println();

    }

}

//4. Instructor.java
// Instructor Class

public class Instructor extends User {

    // Constructor
    public Instructor(String name) {
        super(name);
    }

    // Method Overriding
    @Override
    void displayInfo() {

        System.out.println("----- Instructor Information -----");
        System.out.println("Name : " + name);
        System.out.println("Role : Instructor");
        System.out.println();

    }

}

//5. Quiz.java
// Quiz Class

public class Quiz implements QuizActions {

    // Interface Method
    @Override
    public void startQuiz() {

        System.out.println("Quiz Started");

    }

    // Interface Method
    @Override
    public void submitQuiz() {

        System.out.println("Quiz Submitted");

    }

}

//6. Main.java
public class Main {

    public static void main(String[] args) {

        // -------------------------------
        // Polymorphism Demonstration
        // -------------------------------

        User user;

        // Student Object
        user = new Student("Tabassum Ridy");
        user.displayInfo();

        // Instructor Object
        user = new Instructor("Mr. Rahman");
        user.displayInfo();

        // -------------------------------
        // Interface Demonstration
        // -------------------------------
        Quiz quiz = new Quiz();

        quiz.startQuiz();

        System.out.println("Student is answering questions...");

        quiz.submitQuiz();

    }
}

/*Output
----- Student Information -----
Name : Tabassum Ridy
Role : Student

----- Instructor Information -----
Name : Mr. Rahman
Role : Instructor

Quiz Started
Student is answering questions...
Quiz Submitted */
