package SBS04;

// Hàm main để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Staff
        IPerson staff = new Staff("Alice", "Manager");
        staff.Insert();
        staff.Update();
        staff.Display();
        staff.Delete();

        System.out.println("---------------------");

        // Tạo đối tượng Student
        IPerson student = new Student(101, "Bob", 20);
        student.Insert();
        student.Update();
        student.Display();
        student.Delete();
    }
}
