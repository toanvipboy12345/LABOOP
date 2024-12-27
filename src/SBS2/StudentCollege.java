package SBS2;

// Lớp StudentCollege kế thừa từ Student
public class StudentCollege extends Student {
    private double score1, score2, score3;

    public StudentCollege(String name, int year, double score1, double score2, double score3) {
        super(name, year);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    // Ghi đè phương thức Average
    @Override
    public double Average() {
        return (score1 + score2 + score3) / 3;
    }

    // Phương thức hiển thị thông tin đầy đủ
    @Override
    public void display() {
        super.display();
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);
        System.out.println("Average: " + Average());
    }
}
