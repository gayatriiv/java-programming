import java.util.Scanner;
import java.util.Vector;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> shoppingList = new Vector<>();

        System.out.println("Enter 5 items for your shopping list:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            String item = sc.nextLine();
            shoppingList.add(item);
        }
        System.out.println("\n Your Shopping List:");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        sc.close();
    }
}
