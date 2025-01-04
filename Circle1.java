import java.util.Scanner;
public class Circle1 {
float r,area;
Circle1(float x)
{
r=x;
}
void calculate()
{
area=3.14f*r*r;
}
void display()
{
System.out.print("Area of circle is : "+area);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius : ");
float x=sc.nextFloat();
sc.close();
Circle1 c=new Circle1(x);
c.calculate();
c.display();
}
}
