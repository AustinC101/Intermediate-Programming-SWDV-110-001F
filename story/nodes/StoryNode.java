package story.nodes;

import model.Character;
import java.util.List;

public abstract class StoryNode {
    public abstract void display(Character player);
    public abstract List<StoryNode> getChildren();
    public abstract StoryNode next(Character player, int choice);

    public String getDisplayText(Character player) {
        return "(You see a crowded forest.)";
    }

    public java.util.List<String> getChoiceLabels() {
        List<StoryNode> kids = getChildren();
        java.util.ArrayList<String> labels = new java.util.ArrayList<>();
        for (int i = 0; i < kids.size(); i++) {
            labels.add("Choice " + (i + 1));
        }
        return labels;
    }

    public int countNodes() {
        java.util.List<StoryNode> kids = getChildren();
        if (kids.isEmpty()) return 1;
        int sum = 1;
        for (StoryNode node : kids) {
            sum += node.countNodes();
        }
        return sum;
    }

    public void collectTitles(java.util.List<String> list) {
        list.add(this.getClass().getSimpleName());
        for (StoryNode child : getChildren()) {
            child.collectTitles(list);
        }
    }
}
