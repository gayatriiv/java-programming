
import java.util.*;

class InvalidMonthException extends Exception {
    public InvalidMonthException(String str) {
        super(str);
    }
}

public class Exceptionhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number:");
        int MonthNum = sc.nextInt();
        sc.close();
        try {
            if (MonthNum < 1 || MonthNum > 12)
                throw new InvalidMonthException("Invalid number entered !!!!");
            else {
                String months[] = {"January", "February", "March", "April", "May", "June", "July", 
                "August", "September", "October", "November", "December"};
                System.out.println("The month is: " + months[MonthNum - 1]);
            }
        } catch (InvalidMonthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}