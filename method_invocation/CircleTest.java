class Circle {
    double radius;

    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;  // assign value
        double area = c.calculateArea(); // method invocation
        System.out.println("Area of circle: " + area);
    }
}
