// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a = new Dog();  // Parent reference, child object
        a.sound();             // Calls Dog's sound()
    }
}
