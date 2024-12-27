package SBS04;

// Lớp Student thực thi IPerson
public class Student implements IPerson {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public void Insert() {
        System.out.println("Inserting student: ID = " + id + ", Name = " + name + ", Age = " + age);
    }

    @Override
    public void Delete() {
        System.out.println("Deleting student: ID = " + id);
    }

    @Override
    public void Update() {
        System.out.println("Updating student: ID = " + id);
    }

    @Override
    public void Display() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
