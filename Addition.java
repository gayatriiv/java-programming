public class Addition {
    public static void main(String[] args) {
        // Checking if command line arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java Addition <number1> <number2>");
            System.exit(1);
        }

        // Parsing command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Performing addition
        int sum = num1 + num2;

        // Printing the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
