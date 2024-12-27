package SBS04;
// Lớp Staff thực thi IPerson
public class Staff implements IPerson {
    private String name;
    private String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void Insert() {
        System.out.println("Inserting staff: " + name + ", Position: " + position);
    }

    @Override
    public void Delete() {
        System.out.println("Deleting staff: " + name);
    }

    @Override
    public void Update() {
        System.out.println("Updating staff: " + name);
    }

    @Override
    public void Display() {
        System.out.println("Staff Name: " + name + ", Position: " + position);
    }
}
