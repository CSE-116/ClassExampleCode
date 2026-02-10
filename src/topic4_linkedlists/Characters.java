package topic4_linkedlists;

import topic2_classes.Character;

public class Characters {

    private LinkedListNode<Character> chars = null;

    public Characters() {
    }

    public void addCharacter(Character character) {
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
        characters.addCharacter(new Character());
        characters.addCharacter(new Character());
        characters.winBattle(500);
        System.out.println();
    }
}
