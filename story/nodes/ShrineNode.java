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
        System.out.println("You gain +30 gold!");
        player.addGold(30);
    }

    @Override
    public String getDisplayText(Character player) {
        // don't double-add gold here; next() will apply gold to keep deterministic behavior
        return "~ The Shrine of Echoes ~\nA glowing gem dissolves into " + player.getPronounPossAdj() + " skin.\nYou feel richer.";
    }

    @Override
    public List<StoryNode> getChildren() {
        ArrayList<StoryNode> list = new ArrayList<>();
        list.add(next);
        return list;
    }

    @Override
    public java.util.List<String> getChoiceLabels() {
        return java.util.Arrays.asList("Accept the blessing");
    }

    @Override
    public StoryNode next(Character player, int choice) {
        player.addGold(30);
        return next;
    }
}
