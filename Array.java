import java.util.*;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        float avg = sum / n;
        System.out.println("Average is " + avg);
        System.out.println("Elements greater than average:");
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
