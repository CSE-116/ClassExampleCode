package memoryexamples.example7_classes;

public class Player {

    private double xLoc;
    private double yLoc;
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(double xLoc, double yLoc, int maxHP) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.damageDealt = 4;
    }

    public int getHP() {
        return this.HP;
    }

    public void takeDamage(int damage) {
        this.HP -= damage;
    }

    public void attack(Player otherPlayer) {
        otherPlayer.takeDamage(this.damageDealt);
    }

    public void move(double dx, double dy) {
        this.xLoc += dx;
        this.yLoc += dy;
    }

    public static void main(String[] args) {
        Player player1 = new Player(0.0, 0.0, 10);
        Player player2 = new Player(7.0, -4.0, 10);
        player2.move(-6.5, 3.4);
        player2.attack(player1);
    }

}