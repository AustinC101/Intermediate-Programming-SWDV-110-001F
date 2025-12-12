package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;

public class NewChapterNode extends StoryNode {
    private StoryNode leftPath;
    private StoryNode rightPath;

    public NewChapterNode(StoryNode leftPath, StoryNode rightPath) {
        this.leftPath = leftPath;
        this.rightPath = rightPath;
    }

    @Override
    public void display(Character player) {
        System.out.println("\n~ A Fork in the Road ~");
        System.out.println("Two paths diverge.");
        System.out.println("1) Left");
        System.out.println("2) Right");
    }

    @Override
    public String getDisplayText(Character player) {
        return "~ A Fork in the Road ~\nTwo paths diverge. Choose carefully.";
    }

    @Override
    public List<StoryNode> getChildren() {
        ArrayList<StoryNode> kids = new ArrayList<>();
        kids.add(leftPath);
        kids.add(rightPath);
        return kids;
    }

    @Override
    public java.util.List<String> getChoiceLabels() {
        return java.util.Arrays.asList("Take Left Path", "Take Right Path");
    }

    @Override
    public StoryNode next(Character player, int choice) {
        return choice == 1 ? leftPath : rightPath;
    }
}
