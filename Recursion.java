import java.util.Scanner;
public class Recursion{
    static int factorial(int n){
    if (n == 1)
    return 1;
    else
    return(n * factorial(n-1));
    }
    public static void main(String[] args) {
    int n, fact;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to calculate Factorial : ");
    n =sc.nextInt();
    fact = factorial(n);
    System.out.println ("Required Power is " + fact);
    sc.close();
    } }

