package week5;

import week4.Character;

public class Characters {

    private LinkedListNode<Character> chars = null;

    public Characters() {
    }

    public void addCharactor(Character character) {
        this.chars = new LinkedListNode<>(character, this.chars);
    }

    public void winBattle(int xp) {

        if (this.chars == null) {
            return;
        } else {
            // for each character, call winBattle(exp)
            winBattle(this.chars, xp);
        }
    }

    private void winBattle(LinkedListNode<Character> node, int xp){
        if(node == null){
            return;
        }
        node.getValue().winBattle(xp);
        this.winBattle(node.getNext(), xp);
    }

    public static void main(String[] args) {
        Characters characters = new Characters();
        characters.addCharactor(new Character());
        characters.addCharactor(new Character());
        characters.winBattle(500);
        System.out.println();
    }
}
