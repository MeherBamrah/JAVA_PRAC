public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello World Java";

        // 1. substring()
        System.out.println("Substring (0,5): " + str.substring(0, 5));

        // 2. split()
        String[] words = str.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 3. replace()
        String replaced = str.replace("Java", "Programming");
        System.out.println("After replace: " + replaced);

        // 4. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. length()
        System.out.println("Length: " + str.length());

        // 6. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 7. contains()
        System.out.println("Contains 'World'? " + str.contains("World"));

        // 8. equals()
        System.out.println("Equals 'Hello World Java'? " + str.equals("Hello World Java"));
    }
}
