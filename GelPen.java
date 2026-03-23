public class GelPen extends Pen{

    public GelPen(String colour, OpenCloseStrategy ocs, RefillStrategy rs) {
        super("Gel", colour, ocs, rs);
    }

    String getWritingStyle(){
        return "smooth gel";
    }
}