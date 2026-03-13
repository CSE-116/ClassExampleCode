package topic5_inheritance.lecture;

public class Weapon extends GameItem {
    private int damage;

    public Weapon(double xloc, double yLoc, int damage) {
        super(xloc, yLoc);
        this.damage = damage;
    }

    public void use() {
        System.out.println("Damage dealt: " + this.damage);
    }

    public String toString() {
        String out = "Weapon Damage: " + this.damage;
        return out;
    }

    public static void main(String[] args) {
        Weapon w = new Weapon(1, 2, 20);
        System.out.println(w);
    }
}
