public class CapStrategy implements OpenCloseStrategy {
    public void open() {
        System.out.println("Removing cap");
    }

    public void close() {
        System.out.println("Closing with cap");
    }
}