import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number :");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Choose option: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit \n");
        c=sc.nextInt();
        switch(c){
            case 1:
            System.out.println("sum is "+(a+b));
            break;
            case 2:
            System.out.println("subtraction is :"+(a-b));
            break;
            case 3:
            System.out.println("Multiplication is:"+(a*b));
            break;
            case 4:
            System.out.println("Division is :" +(a/b));
            break;
            default:
            System.out.println("Enter correct option");
            sc.close();
        }
    }
    
}
