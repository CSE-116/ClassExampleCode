package topic5_inheritance.live;

public class HealthPotion extends GameItem {
    private int increase;

    public HealthPotion(double xLoc, double yLoc, int increase) {
        super(xLoc, yLoc);
        this.increase = increase;
    }

    public int getIncrease(){
        return this.increase;
    }

    @Override
    public String toString() {
        String out = super.toString() + " - Health Potion [" + this.increase + "]";
        return out;
    }

}
