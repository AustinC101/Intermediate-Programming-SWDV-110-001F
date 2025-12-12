package story;

import story.nodes.EncounterNode;
import story.nodes.KnowledgeNode;
import story.nodes.NewChapterNode;
import story.nodes.RewardNode;
import story.nodes.ShrineNode;
import story.nodes.SimpleEndingNode;
import story.nodes.StoryNode;
import story.nodes.BadEndingNode;
import story.nodes.ContinueEndingNode;
import model.Character;
import java.util.ArrayList;
import java.util.Scanner;

public class Story {
    private StoryNode root;

    public Story() {

        StoryNode simpleEnding = new SimpleEndingNode();
        StoryNode badEnding = new BadEndingNode();
        StoryNode continueEnding = new ContinueEndingNode();

        StoryNode shrineAfterRed = new ShrineNode(simpleEnding);
        StoryNode shrineAfterBlue = new ShrineNode(continueEnding);

        StoryNode deepReward = new RewardNode(shrineAfterRed);        
        StoryNode deepKnowledge = new KnowledgeNode(shrineAfterBlue); 

        StoryNode ambush = new EncounterNode("Goblin Ambush", deepReward);
        StoryNode leshy = new EncounterNode("Leshy", ambush);

        StoryNode oddAlcove = new NewChapterNode(deepKnowledge, leshy);

        StoryNode oldLibrary = new KnowledgeNode(oddAlcove);
        StoryNode hauntedPass = new EncounterNode("Wailing Shade", oddAlcove);

        StoryNode rootFork = new NewChapterNode(oldLibrary, hauntedPass);

        StoryNode glitterPool = new RewardNode(badEnding); 
        StoryNode temptingPath = new NewChapterNode(glitterPool, rootFork);

        this.root = temptingPath;
    }

    public StoryNode getRoot() {
        return root;
    }

    public void run(Character player) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        StoryNode current = root;

        while (current != null) {
            current.display(player);

            if (current.getChildren().isEmpty()) {
                current = null;
                break;
            }

            int choice = 1;
            if (current.getChildren().size() > 1) {
                System.out.print("Choose (1 or 2): ");
                choice = in.nextInt();
            }

            current = current.next(player, choice);
        }

        System.out.println("\nStory contains " + root.countNodes() + " nodes total.");

        java.util.ArrayList<String> titles = new java.util.ArrayList<>();
        root.collectTitles(titles);
        System.out.println("Node types encountered: " + titles);
    }
}
