public class BallPen extends Pen{

    public BallPen(String colour, OpenCloseStrategy ocs, RefillStrategy rs) {
        super("Ball", colour, ocs, rs);
    }

    String getWritingStyle() {
        return "smooth ballpoint";
    }
}