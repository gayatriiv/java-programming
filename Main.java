import java.util.Scanner;
import java.util.Vector;
 class Main {
    public static void main(String[] args) {
        Vector<String>student=new Vector<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter \n 1 \n 2 \n 3 \n 4 \n 5 ");
            System.out.println();
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("Enter student name: ");
                String str=sc.nextLine();
                student.add(str);
                break;
                case 2:
                System.out.println("Enter student name to be removed: ");
                String rem=sc.nextLine();
                if(student.contains(rem))
            {
                student.remove(student.indexOf(rem));
            }
            else{
                System.out.println("not found!");

            }
            break;
            case 3:
            System.out.println("enter name for search:");
            String str1=sc.nextLine();
            if(student.contains(str1))
            {
                System.out.println("found");
            }
        else{
            System.out.println("not found");
        }
        break;
        case 4:
        System.out.println("display record");
        System.out.println(student);
        break;
        case 5:
        System.out.println("Exit");
        break;
        default:
        System.out.println("error");
            }
        }
    }
    
}
