package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class SimpleEndingNode extends StoryNode {
    @Override
    public void display(Character player) {
        System.out.println("\n~ Journey Complete ~");
        System.out.println(player.getName() + " steps back into the sunlight, changed forever.");
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
