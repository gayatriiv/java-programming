
public class StringDemo {
    public static void main(String[] args) {
        // Create a String object
        String str = "Hello, World";

        // Method 1: length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Method 2: charAt()
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Method 3: substring()
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Method 4: indexOf()
        int indexOf = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOf);

        // Method 5: replace()
        String replacedString = str.replace("World", "Java");
        System.out.println("After replacement: " + replacedString);
    }
}

