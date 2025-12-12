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
    public String getDisplayText(Character player) {
        StringBuilder sb = new StringBuilder();
        sb.append("A ").append(creature).append(" leaps from the shadows!\n");
        sb.append(player.getName()).append(" raises ").append(player.getPronounPossAdj()).append(" weapon.\n");
        sb.append("You may press on...");
        return sb.toString();
    }

    @Override
    public List<StoryNode> getChildren() {
        ArrayList<StoryNode> list = new ArrayList<>();
        list.add(next);
        return list;
    }

    @Override
    public java.util.List<String> getChoiceLabels() {
        return java.util.Arrays.asList("Proceed");
    }

    @Override
    public StoryNode next(Character player, int choice) {
        return next;
    }
}
