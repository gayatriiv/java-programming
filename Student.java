import java.util.Scanner;

public class Student {
    int roll_no;
    String name;

    void Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter roll no:");
        roll_no = sc.nextInt();
    }

    static class Exam {
        int a1, a2, a3;

        void enterMarks() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks for BEE, Java and PCE: ");
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            a3 = sc.nextInt();
            sc.close();
        }
    }

    static class Result extends Exam {
        int total;

        void calculateTotal() {
            total = a1 + a2 + a3;
            System.out.println("Total marks = " + total);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.Details();
        Result result = new Result();
        result.enterMarks();
        result.calculateTotal();
    }
}
