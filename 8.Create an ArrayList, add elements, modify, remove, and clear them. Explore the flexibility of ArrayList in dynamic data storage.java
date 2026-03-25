public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Delete part of the string
        sb.delete(5, 6); // removes the comma
        System.out.println("After delete: " + sb);

        // Replace part of the string
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Capacity and length
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
