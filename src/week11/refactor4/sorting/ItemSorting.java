package week11.refactor4.sorting;

import week11.refactor4.GameItem;
import week11.refactor4.HealthPotion;
import week11.refactor4.Player;
import week11.refactor4.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemSorting {

    public static void main(String[] args) {
        ArrayList<GameItem> items = new ArrayList<>(Arrays.asList(
                new HealthPotion(1.0, 2.0, 10),
                new HealthPotion(10.0, 12.0, 100),
                new HealthPotion(5.0, -2.0, 20),
                new Weapon(0.0, 0.0, 3),
                new Weapon(10.0, -10.0, 30),
                new Weapon(5.0, 5.0, 20)
        ));

        Player player = new Player(50);
        InsertionSort<GameItem> sorter = new InsertionSort<>(new DistanceToPlayerComparator(player));
        ArrayList<GameItem> itemsSorted = sorter.sort(items);
        for(GameItem item : itemsSorted){
            System.out.println(item);
        }
    }

}
