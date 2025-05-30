package week11.refactor4;

public class HealthPotion extends GameItem {
    private int increase;

    public HealthPotion(double xLoc, double yLoc, int increase) {
        super(xLoc, yLoc);
        this.increase = increase;
    }

    public void use(Player player) {
        player.takeDamage(-this.increase);
    }

    public int getIncrease(){
        return this.increase;
    }

    @Override
    public String toString() {
        String out = super.toString() + " - Health Potion [" + this.increase + "]";
        return out;
    }

    public static void main(String[] args) {
        HealthPotion h = new HealthPotion(2, 3, 10);
        h.move(2, 4);
        System.out.println(h);
    }
}
