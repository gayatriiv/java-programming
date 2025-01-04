import java.util.Scanner;
public class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and exponent: ");
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        System.out.println("Required power is " +power(base,exponent));
        sc.close();
    }

    static int power(int base,int exponent)
    {
        if(exponent==0)
        return 1;
        return(base*power(base,exponent-1));
    }
    
}
