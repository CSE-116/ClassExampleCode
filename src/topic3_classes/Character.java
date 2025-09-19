package topic3_classes;

public class Character {
    private int battlesWon = 0;
    private int expPoints = 0;

    public Character() {
    }

    public void winBattle(int xp) {
        this.battlesWon++;
        this.expPoints += xp;
    }
}
