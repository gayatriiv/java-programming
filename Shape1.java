import java.util.Scanner;

// Base class
class Shape {
    protected double radius;

    public void readRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        scanner.close();
    }
}

// Derived class 1: Circle
class Circle extends Shape {
    protected double area;

    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Enter area of circle: "+area);
    }
}

// Derived class 2: Sphere
class Sphere extends Circle {
    protected double volume;

    public void calculateVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void displayVolume() {
        System.out.println("Volume of the sphere: " + volume);
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();

        // Accept radius from the user
        sphere.readRadius();

        // Calculate area of the circle
        sphere.calculateArea();

        // Calculate volume of the sphere
        sphere.calculateVolume();

        // Display volume of the sphere
        sphere.displayVolume();
    }
}
