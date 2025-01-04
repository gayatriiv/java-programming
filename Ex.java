
import java.util.Scanner;
public class Ex {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input the dimensions of the array
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
int columns = scanner.nextInt();
// Input elements into the 2D array
int[][] matrix = new int[rows][columns];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
matrix[i][j] = scanner.nextInt();
}
}
// Calculate sum of elements
int sum = 0;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
sum += matrix[i][j];
}
}
System.out.println("Sum of elements in the 2D array: " + sum);
scanner.close();
}
}
