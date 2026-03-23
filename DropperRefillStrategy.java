public class DropperRefillStrategy implements RefillStrategy {
    public void refill(String color) {
        System.out.println("Using dropper to refill " + color + " ink...");
    }
}