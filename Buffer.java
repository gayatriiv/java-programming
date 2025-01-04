public class Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Method 1: append()
        stringBuffer.append(" World");
        System.out.println("After appending: " + stringBuffer);

        // Method 2: insert()
        stringBuffer.insert(5, " Java");
        System.out.println("After inserting: " + stringBuffer);

        // Method 3: delete()
        stringBuffer.delete(5, 10);
        System.out.println("After deleting: " + stringBuffer);

        // Method 4: reverse()
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // Method 5: setCharAt()
        stringBuffer.setCharAt(0, 'h');
        System.out.println("After setting character: " + stringBuffer);

    }
}

