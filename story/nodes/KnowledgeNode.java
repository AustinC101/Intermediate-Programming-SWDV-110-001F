package story.nodes;

import java.util.ArrayList;
import java.util.List;
import model.Character;

public class KnowledgeNode extends StoryNode {
    private StoryNode next;
    
    public KnowledgeNode(StoryNode next) {
        this.next = next;
    }

    @Override
    public void display(Character player) {
        System.out.println("\nYou walk the Blue Tunnel...");
        System.out.println("Ancient runes glow and whisper forgotten secrets.");
        System.out.println("Your wisdom deepens (no gold gained).");
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
