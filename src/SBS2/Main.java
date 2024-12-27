package SBS2;

// Hàm main để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng StudentCollege
        StudentCollege student = new StudentCollege("John Doe", 2023, 8.5, 7.0, 9.0);

        // Hiển thị thông tin và điểm trung bình
        student.display();
    }
}
