package memoryexamples.example8_inheritance;

public class GameItem {

    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void move(double dx, double dy) {
        this.xLoc += dx;
        this.yLoc += dy;
    }

}
