package story;

import story.nodes.EncounterNode;
import story.nodes.KnowledgeNode;
import story.nodes.NewChapterNode;
import story.nodes.RewardNode;
import story.nodes.ShrineNode;
import story.nodes.SimpleEndingNode;
import story.nodes.StoryNode;
import model.Character;
import java.util.ArrayList;
import java.util.Scanner;

public class Story {

  private StoryNode root;

  public Story() {
    StoryNode ending = new SimpleEndingNode();

    StoryNode red = new RewardNode(ending);
    StoryNode blue = new KnowledgeNode(ending);

    StoryNode cavern = new NewChapterNode(blue, red);
    StoryNode shrine = new ShrineNode(cavern);
    StoryNode encounter = new EncounterNode("Leshy", shrine);

    this.root = encounter;
  }

  public void run(Character player) {
    Scanner in = new Scanner(System.in);
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

    ArrayList<String> titles = new ArrayList<>();
    root.collectTitles(titles);
    System.out.println("Node types encountered: " + titles);
  }
}
