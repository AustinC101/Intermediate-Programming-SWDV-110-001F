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
        System.out.println("A fire sprit blesses you with 50 gold.");
        player.addGold(50);
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
