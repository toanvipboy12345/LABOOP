package SBS1;

public class Window {
    protected int top;
    protected int left;

    public Window(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void DrawWindow() {
        System.out.println("Drawing a window at position (" + top + ", " + left + ")");
    }
}
