package week11.refactor4.sorting;

import week11.refactor4.GameItem;

public class DistanceCalculator {

    protected double distance(GameItem item1, GameItem item2) {
        return Math.sqrt(
                        Math.pow(item1.getX() - item2.getX(), 2.0) +
                        Math.pow(item1.getY() - item2.getY(), 2.0)
                        );
    }

}
