public class ClickStrategy implements OpenCloseStrategy {
    public void open() {
        System.out.println("Clicking to open");
    }

    public void close() {
        System.out.println("Clicking to close");
    }
}