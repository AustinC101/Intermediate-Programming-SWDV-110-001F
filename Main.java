import java.util.Scanner;
import model.Character;
import story.Story;
import utils.GameUtils;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your character's name: ");
        String name = in.nextLine();
        System.out.print("Choose pronoun subject (he/she/they): "):
        String subj = in.next();
        System.out.print("choose pronoun object (him/her/them): ");
        String obj = in.next();
        System.out.print("Choose possessive adjective (his/her/their): ");
        String possAdj = in.next();
        System.out.print("enter your character's age: ");
        int age = in.nextInt();
        System.out.print("Enter your role (fighter, mage, rogue, etc.): ");
        String role = in.next();

        Character player = new Character(name, subj, obj, possAdj, age, 12, role);
        Story story = new Story();

        story.prologue(player);
        story.encounter(player, "Leshy");

        String[] inventory = {"sword", "map", "torch"};
        GameUtils.printInventory(inventory);

        story.shrineOfEchoes(player);

        System.out.println("\nTotal gold after the Shrine: " + player.getGold());
        in.close();
    }
}
