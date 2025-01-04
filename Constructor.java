public class Constructor 
{
    int a = 0;
    int b = 0;
Constructor()
{
    a=10;
    b=5;
}
Constructor(int x,int y)
{
    a=x;
    b=y;
}
void display()
{
    System.out.println("Area of rectangle: "+(a*b));
    System.out.println("Perimeter : "+ (2*(a+b)));
}
public static void main(String args[])
{
    Constructor sc1=new Constructor();
    Constructor sc2=new Constructor(7,7);
    sc1.display();
    sc2.display();
}
}
