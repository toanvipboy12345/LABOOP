package SBS3;

// Lớp Rectangle kế thừa từ Shape
public class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public double Circumference() {
        return 2 * (length + width);
    }
}
