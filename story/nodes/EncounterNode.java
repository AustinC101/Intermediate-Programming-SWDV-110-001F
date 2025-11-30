package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class EncounterNode extends StoryNode {
    private String creature;
    private StoryNode next;

    public EncounterNode(String creature, StoryNode next) {
        this.creature = creature;
        this.next = next;
    }

    @Override
    public void display(Character player) {
        System.out.println("\nA " + creature + " leaps from the shadows!");
        System.out.println(player.getName() + " raises " + player.getPronounPossAdj() + " weapon.");
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
