package week11.refactor4.sorting;

import week11.refactor4.GameItem;
import week11.refactor4.Player;

public class DistanceToPlayerComparator extends DistanceCalculator implements Comparator<GameItem> {

    private Player player;

    public DistanceToPlayerComparator(Player player){
        this.player = player;
    }

    @Override
    public boolean compare(GameItem item1, GameItem item2){
        return distance(item1, this.player) < distance(item2, this.player);
    }

}
