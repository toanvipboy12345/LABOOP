package SBS3;

// Lớp Circle kế thừa từ Shape
public class Circle extends Shape {
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Circumference() {
        return 2 * Math.PI * radius;
    }
}
