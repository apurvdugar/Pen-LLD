public class PenFactory {

    public static Pen createPen(String type, String colour, String mechanism, String refillType) {

        OpenCloseStrategy ocs;
        if (mechanism.equalsIgnoreCase("click")) {
            ocs = new ClickStrategy();
        } else if (mechanism.equalsIgnoreCase("cap")) {
            ocs = new CapStrategy();
        } else {
            throw new IllegalArgumentException("Invalid mechanism");
        }

        RefillStrategy rs;
        if (refillType.equalsIgnoreCase("top")) {
            rs = new TopRefillStrategy();
        } else if (refillType.equalsIgnoreCase("bottom")) {
            rs = new BottomRefillStrategy();
        } else if (refillType.equalsIgnoreCase("dropper")) {
            rs = new DropperRefillStrategy();
        } else {
            throw new IllegalArgumentException("Invalid refill type");
        }

        if (type.equalsIgnoreCase("gel")) {
            return new GelPen(colour, ocs, rs);
        } else if (type.equalsIgnoreCase("ball")) {
            return new BallPen(colour, ocs, rs);
        } else if (type.equalsIgnoreCase("ink")) {
            return new InkPen(colour, ocs, rs);
        }

        throw new IllegalArgumentException("Invalid pen type");
    }
}