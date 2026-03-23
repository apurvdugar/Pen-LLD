public abstract class Pen {

    String type;
    String color;
    OpenCloseStrategy openCloseStrategy;
    RefillStrategy refillStrategy;
    boolean isOpen;
    int inkLevel;

    public Pen(String type, String color, OpenCloseStrategy openCloseStrategy, RefillStrategy refillStrategy) {
        this.type = type;
        this.color = color;
        this.openCloseStrategy = openCloseStrategy;
        this.refillStrategy = refillStrategy;
        this.isOpen = false;
        this.inkLevel = 100;
    }

    public void refill(String newColor) {
        this.color = newColor;
        refillStrategy.refill(newColor);
        this.inkLevel = 100;
    }

    public void start() {
        if(isOpen){
            System.out.println(type + " is already open.");
            return;
        }
        openCloseStrategy.open();
        isOpen = true;
        System.out.println(type + " is ready to write.");
    }

    public void write(String input) {
        if(!isOpen){
            System.out.println("Pen is closed. Open pen.");
            return;
        }
        if(inkLevel <= 0){
            System.out.println("Ink Empty. Please refill the pen.");
            return;
        }
        System.out.println("[" + type + " | " + color + " | " + getWritingStyle() + "] " + input);
        inkLevel -= 10; // simulate usage
    }

    public void close() {
        if(!isOpen) {
            System.out.println(type + "is already closed.");
            return;
        }
        openCloseStrategy.close();
        isOpen = false;
    }

    abstract String getWritingStyle();
}