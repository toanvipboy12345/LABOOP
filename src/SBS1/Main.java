package SBS1;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Button
        Button button = new Button(10, 20);
        button.DrawWindow();

        // Tạo đối tượng ListBox
        ListBox listBox = new ListBox(30, 40, "Hello World");
        listBox.DrawWindow();
    }
}
