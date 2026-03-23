public class TopRefillStrategy implements RefillStrategy {
    public void refill(String color) {
        System.out.println("Refilling from top with " + color + " ink...");
    }
}