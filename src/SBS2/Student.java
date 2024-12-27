package SBS2;

// Lớp trừu tượng Student
public abstract class Student {
    protected String name;
    protected int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
    }

    // Phương thức trừu tượng để tính điểm trung bình
    public abstract double Average();
}
