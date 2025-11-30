package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class ShrineNode extends StoryNode {
    private StoryNode next;

    public ShrineNode(StoryNode next) {
        this.next = next;
    }

    @Override
    public void display(Character player) {
        System.out.println("\n~ The Shrine of Echoes ~");
        System.out.println("Whispers swirl around " + player.getName());
        System.out.println("A glowing gem dissolves into " + player.getPronounPossAdj() + " skin.");
        System.out.println("You gain +30 gold!");
        player.addGold(30);
    }

    @Override
    public List<StoryNode> getChildren() {
        ArrayList<StoryNode> list = new ArrayList<>();
        list.add(next);
        return list;
    }

    @Override
    public StoryNode next(Character player, int choice) {
        return next;
    }
}
