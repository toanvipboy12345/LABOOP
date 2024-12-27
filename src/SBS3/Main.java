package SBS3;

// Hàm main để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.Area());
        System.out.println("Circle Circumference: " + circle.Circumference());

        // Tạo đối tượng Rectangle
        Shape rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle Area: " + rectangle.Area());
        System.out.println("Rectangle Circumference: " + rectangle.Circumference());
    }
}
