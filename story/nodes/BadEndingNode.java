package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class BadEndingNode extends StoryNode {

    @Override
    public void display(Character player) {
        System.out.println("\n~ A Bitter End ~");
        System.out.println("Greed caught up to " + player.getName() + ". The glitter was a trap.");
    }

    @Override
    public String getDisplayText(Character player) {
        return "~ A Bitter End ~\nGreed caught up to " + player.getName() + ". The glitter was a trap.";
    }

    @Override
    public List<StoryNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public StoryNode next(Character player, int choice) {
        return null;
    }
}
