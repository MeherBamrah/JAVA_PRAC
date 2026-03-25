public class StringBufferDemo {
    public static void main(String[] args) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. replace()
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // 4. delete()
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. capacity() and length()
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
