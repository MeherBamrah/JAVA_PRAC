final class Student {
    private final int id;
    private final String name;

    // Constructor initializes all fields
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Only getters, no setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableDemo {
    public static void main(String[] args) {
        Student s = new Student(1, "Rahul");

        System.out.println(s.getId());
        System.out.println(s.getName());

        // No way to modify object state
    }
}
