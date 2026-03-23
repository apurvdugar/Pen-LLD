public class InkPen extends Pen{

    public InkPen(String color, OpenCloseStrategy ocs, RefillStrategy rs) {
        super("Ink", color, ocs, rs);
    }

    String getWritingStyle() {
        return "Fine stroke";
    }

}