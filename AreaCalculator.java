public class AreaCalculator {
    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double circleArea = calculateArea(5);
        System.out.println("Area of circle: " + circleArea);

        double rectangleArea = calculateArea(4, 6);
        System.out.println("Area of rectangle: " + rectangleArea);

        double triangleArea = calculateArea(3, 4);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
