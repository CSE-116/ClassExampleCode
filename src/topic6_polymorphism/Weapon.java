package topic6_polymorphism;

public class Weapon extends GameItem implements Usable{
    private int damage;

    public Weapon(double xloc,double yLoc,int damage){
        super(xloc,yLoc);
        this.damage=damage;
    }
    public void use(Player player){
        player.setDamageDealt(this.damage);
    }
    public String toString(){
        String out="Weapon at "+super.toString();
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Weapon w=new Weapon(1,2,20);
        w.use(p1);
        System.out.println(p1);
        System.out.println(w);
    }
}
