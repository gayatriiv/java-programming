import java.util.Scanner;

interface Volume {
    double calculateVolume();
    void displayVolume();
}

class Sphere implements Volume {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void displayVolume() {
        System.out.println("Volume of the sphere: " + calculateVolume());
    }
}

class Hemisphere implements Volume {
    double radius;

    Hemisphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (2.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void displayVolume() {
        System.out.println("Volume of the hemisphere: " + calculateVolume());
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for sphere
        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        Volume sphere = new Sphere(sphereRadius);
        sphere.displayVolume();

        // Input for hemisphere
        System.out.print("Enter the radius of the hemisphere: ");
        double hemisphereRadius = scanner.nextDouble();
        Volume hemisphere = new Hemisphere(hemisphereRadius);
        hemisphere.displayVolume();

        scanner.close();
    }
}
