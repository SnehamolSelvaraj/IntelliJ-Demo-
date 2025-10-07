class Rectangle {
    int length;
    int breadth;

    public void setDimensions(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(5, 10);  // method 1
        int perimeter = r.getPerimeter();  // method 2
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}
