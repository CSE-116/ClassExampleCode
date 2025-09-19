package topic7_trees.example;

import topic5_inheritance.Comparator;
import topic5_inheritance.HealthPotion;

public class HealthPotionComparator extends Comparator<HealthPotion> {

    @Override
    public boolean compare(HealthPotion potion1, HealthPotion potion2){
        return potion1.getIncrease() > potion2.getIncrease();
    }

}
