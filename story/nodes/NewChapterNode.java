package story.nodes;

import java.util.List;
import java.util.ArrayList;
import model.Character;
import java.util.Scanner;

public class NewChapterNode extends StoryNode {
    private StoryNode leftPath;
    private StoryNode rightPath;

    public NewChapterNode(StoryNode leftPath, StoryNode rightPath) {
        this.leftPath = leftPath;
        this.rightPath = rightPath;
    }

    @Override
    public void display(Character player) {
        System.out.println("\n~ The Crystal Cavern ~");
        System.out.println("Glittering walls hum with ancient power.");
        System.out.println("Two paths diverge: one glowing blue, the other red.");
        System.out.println("1) Enter the Blue Tunnel (mystic knowledge)");
        System.out.println("2) Enter the Red Tunnel (danger & reward)");
    }

    @Override
    public List<StoryNode> getChildren() {
        ArrayList<StoryNode> kids = new ArrayList<>();
        kids.add(leftPath);
        kids.add(rightPath);
        return kids;
    }

    @Override
    public StoryNode next(Character player, int choice) {
        return choice == 1 ? leftPath : rightPath;
    }
}
