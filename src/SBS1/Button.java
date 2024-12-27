package SBS1;

public class Button extends Window {

    public Button(int top, int left) {
        super(top, left);
    }

    @Override
    public void DrawWindow() {
        System.out.println("Drawing a button at position (" + top + ", " + left + ")");
    }
}
