// First interface
interface Animal {
    void eat();
}

// Second interface
interface Bird {
    void fly();
}

// Class implementing multiple interfaces
class Bat implements Animal, Bird {

    @Override
    public void eat() {
        System.out.println("Bat eats fruits and insects.");
    }

    @Override
    public void fly() {
        System.out.println("Bat can fly.");
    }
}

// Main class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat();
        b.fly();
    }
}
