public class Patternsss {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                if (k == 1 && i > 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i);
                    if (k < i) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
