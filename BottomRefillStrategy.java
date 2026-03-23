public class BottomRefillStrategy implements RefillStrategy {
    public void refill(String color) {
        System.out.println("Refilling from bottom with " + color + " ink...");
    }
}