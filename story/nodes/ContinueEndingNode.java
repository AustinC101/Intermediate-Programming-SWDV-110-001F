package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class ContinueEndingNode extends StoryNode {

    @Override
    public void display(Character player) {
        System.out.println("\n~ To Be Continued ~");
        System.out.println(player.getName() + " senses more beyond the horizon...");
    }

    @Override
    public String getDisplayText(Character player) {
        return "~ To Be Continued ~\n" + player.getName() + " senses more beyond the horizon...";
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
