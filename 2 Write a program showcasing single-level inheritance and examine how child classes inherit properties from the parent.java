// Parent class
class Person {
    String name = "Rahul";
    int age = 30;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Student extends Person {
    int rollNo = 101;

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Accessing parent class method
        s.displayPerson();

        // Accessing child class method
        s.displayStudent();
    }
}
