package memoryexamples.example8_inheritance;

public class Teleporter extends GameItem {

    private double dx;
    private double dy;

    public Teleporter(double xLoc, double yLoc, double dx, double dy) {
        super(xLoc, yLoc);
        this.dx = dx;
        this.dy = dy;
    }

    public static void main(String[] args) {
        Teleporter t = new Teleporter(2, 2, 3, 3);
        t.move(2, 3);
    }

}
