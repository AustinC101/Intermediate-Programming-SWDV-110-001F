package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class RewardNode extends StoryNode {
    private StoryNode next;

    public RewardNode(StoryNode next) {
        this.next = next;
    }

    @Override
    public void display(Character player) {
        System.out.println("\nYou brave the Red Tunnel!");
        System.out.println("A fire spirit blesses you with 50 gold.");
        player.addGold(50);
    }

    @Override
    public String getDisplayText(Character player) {
        // apply side-effect for GUI as well
        player.addGold(0); // no-op here, but GUI will call next which could trigger; keep side-effects in display if you prefer
        return "A warm glow surrounds you — you feel wealthier.";
    }

    @Override
    public List<StoryNode> getChildren() {
        ArrayList<StoryNode> list = new ArrayList<>();
        list.add(next);
        return list;
    }

    @Override
    public java.util.List<String> getChoiceLabels() {
        return java.util.Arrays.asList("Collect and move on");
    }

    @Override
    public StoryNode next(Character player, int choice) {
        player.addGold(50); // ensure gold is added when traversing from GUI
        return next;
    }
}
