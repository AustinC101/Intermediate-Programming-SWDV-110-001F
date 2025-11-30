package story.nodes;

import model.Character;
import java.util.List;

public abstract class StoryNode {
    public abstract void display(Character player);

    public abstract List<StoryNode> getChildren();

    public abstract StoryNode next(Character player, int choice);

    public int countNodes() {
        List<StoryNode> kids = getChildren();
        if (kids.isEmpty()) return 1;
        int sum = 1;
        for (StoryNode node : kids) {
            sum += node.countNodes();
        }
        return sum;
    }

    public void collectTitles(List<String> list) {
        list.add(this.getClass().getSimpleName());
        for (StoryNode child : getChildren()) {
            child.collectTitles(list);
        }
    }
}
