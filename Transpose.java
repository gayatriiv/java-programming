import java.util.Scanner;
public class Transpose {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input the dimensions of the matrix
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
int columns = scanner.nextInt();
// Input elements into the matrix
int[][] matrix = new int[rows][columns];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
matrix[i][j] = scanner.nextInt();
}
}
// Transpose the matrix
int[][] transpose = new int[columns][rows];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
transpose[j][i] = matrix[i][j];
}
}
// Display the transpose matrix
System.out.println("Transpose of the matrix:");
for (int i = 0; i < columns; i++) {
for (int j = 0; j < rows; j++) {
System.out.print(transpose[i][j] + " ");
}
System.out.println();
}
scanner.close();
}
}
