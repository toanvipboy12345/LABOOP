package SBS1;

public class ListBox extends Window {
    private String content;

    public ListBox(int top, int left, String content) {
        super(top, left);
        this.content = content;
    }

    @Override
    public void DrawWindow() {
        System.out.println("Drawing a list box at position (" + top + ", " + left + ") with content: " + content);
    }
}
