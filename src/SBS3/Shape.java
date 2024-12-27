package SBS3;

// Lớp trừu tượng Shape
public abstract class Shape {
    protected double radius;
    protected double length;
    protected double width;

    // Phương thức trừu tượng
    public abstract double Area();
    public abstract double Circumference();
}
