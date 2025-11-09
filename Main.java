import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // --- Collect basic character info ---
        System.out.print("Enter your character's name: ");
        String name = in.nextLine();

        System.out.print("Choose a pronoun subject (he/she/they): ");
        String proSubj = in.next().toLowerCase();         // e.g., he / she / they

        System.out.print("Choose a pronoun object (him/her/them): ");
        String proObj = in.next().toLowerCase();          // e.g., him / her / them

        System.out.print("Choose a possessive adjective (his/her/their): ");
        String proPossAdj = in.next().toLowerCase();      // e.g., his / her / their

        System.out.print("Enter your character's age: ");
        int age = in.nextInt();

        // An example integer you can reference later (feel free to rename/use differently)
        int gold = 12;

        // --- Prologue paragraph (≥ 5 sentences using ≥ 5 variables) ---
        System.out.println();
        System.out.println("~ ~ ~ Adventure Prologue ~ ~ ~");
        System.out.println(name + " set out at dawn, " + proPossAdj + " pack light and hopes high.");
        System.out.println("At only " + age + " years old, " + proSubj + " already carries stories that most would never dare to tell.");
        System.out.println("In the pouch at " + proPossAdj + " side clinked " + gold + " gold coins— "
                + "not much, but enough for bread and a bed in a quiet inn.");
        System.out.println("A weathered sign pointed toward the Whispering Woods, and " + proSubj
                + " felt a shiver that had nothing to do with the cold.");
        System.out.println("Whatever waited beyond the treeline would test " + proObj + ", but " + name
                + " walked on without looking back.");

        // (You will add TWO more paragraphs below for your submission.)
        // TIP: Use more variables to store place names, items, stats, etc.

        System.out.println("    ");

        System.out.print("Enter your character's role (ex. fighter, mage, cleric, etc.): ");
        String role = in.next().toLowerCase();                  // assign's the character their role
        System.out.print("Enter your first emotion: ");
        String emotion1 = in.next();                            // character's first emotion
        System.out.print("Enter your second emotion: ");
        String emotion2 = in.next();                            // character's second emotion
        System.out.print("Enter your last emotion: ");
        String emotion3 = in.next();                            // character's third emotion
        System.out.print("Pick a number between 1 and " + gold + ": ");
        int coinUsed = in.nextInt();                            // Coins used by the character
        gold -= coinUsed;                                       // Gold left over from being used

        System.out.println("    ");
                                        
        // First paragraph (5 sentences using 5 new variables)
        System.out.println("While proceeding forward towards the Whispering Woods, " + name + " felt a surge of emotion. ");
        System.out.println("Being a traveler as well as a " + role + " against the creatures in the night, " + proSubj
                 + " should be used to these emotions; " + emotion1 + ", " + emotion2 + ", and " + emotion3 + ". ");
        System.out.println("Starting to feel the overwhelming sense of " + emotion1 + ", " + name + " starts to feel paranoid like " + proSubj
                 + " is being watched through the trail along the tree line of the dense forest. ");
        System.out.println(name + " stops to look around, before pulling out " + coinUsed + " gold coin(s) from " + proPossAdj + " side pouch bringing " + proObj + " to " + gold + " gold coins in " + proPossAdj + " pouch. ");
        System.out.println("Tossing it to hopefully ease " + proPossAdj + " paranoia and " + emotion1
                 + " whilst traveling through the woods, hearing all sorts of strange sounds from nature and animals.");
        
        System.out.println("    ");

        System.out.print("Enter a time of day (dawn, morning, noon, afternoon): ");
        String day = in.next();                                 // time of day the character set out
        System.out.print("Enter a time of night (dusk, evening, night, midnight): ");
        String night = in.next();                               // time of night the character notices it's dark
        System.out.print("What is your choice of weapon? ");
        String weapon = in.next();                              // character's choice of weapon
        System.out.print("How heavy is your weapon? (in pounds/lbs): ");
        String weight = in.next();                              // The weight of the weapon
        System.out.print("Who are you? (boy, girl, adventurer): ");
        String being = in.next();                               // The being of the adventurer
        System.out.print("Enter a mythical creature: ");
        String mythic = in.next();                              // The ruler of the forest

        System.out.println("    ");

        // Second paragraph
        System.out.println("Time seems to lack any sense here, although " + name + " set out at " + day + ", it feels as though it is already being to fall to " + night
                 + " which only means it's a matter of time before creatures start coming out and lurking around. ");
        gold += coinUsed;                                       // Put the coins that were used back in the pouch
        System.out.println("Tossing the " + coinUsed + " gold coin(s) back into " + proPossAdj + " pouch bringing " + proObj + " back to " + gold + ", " + name + " starts to pull out a " + weapon
                 + ", weighing at around " + weight + " pounds which " + proSubj + " got from trading around some items " + proSubj + " has gotten over his adventures. ");
        System.out.println("Everything seems to be closing in on " + proObj + ", sounds of beasts and creatures surrounding the " + being + " which makes " + proPossAdj
                 + " instincts stand on alert preparing " + proObj + " for attacks or threats against " + proPossAdj + " life and safety. ");
        System.out.println("Coming close to the end of the forest, " + name + " stops after hearing a growl from one of the many beasts he has heard about through the passing towns. ");
        System.out.println("Preparing " + proObj + "self for the battle against the creature, " + proSubj + " waits quietly for its first move, suddenly everything seems to go still and silent. ");
        System.out.println("The so called beast happened to be a unique creature, one from legends and seemingly unknown to most, a " + mythic + ". ");

        System.out.println("    ");

        // Start of Project 2
        if (night == "night" || night == "midnight") {          // First if statement
            System.out.println("It is now nightfall and " + name + " can barely see 5 feet in front of " + proObj + "self.");
        }

        if (day == "dawn" || day == "morning") {        // First if-else statement
            System.out.println("The "+ mythic + " noticed that the traveler is tired from their expedition and invites the traveler to rest. " + name + " takes the " + mythic 
                + "'s offer and rests up next to it for the night.");    
        } else if (age < 35) {
            System.out.println("The traveler thinks that they are still fine to travel further on since they've left the village later than usual.");
        } else {
            System.out.println("Due to the traveler's age " + name + " wasn't able to make it very far from the " + mythic + " and has lost consciousness.");    
        }

        while (gold > 0) {      // First while loop
            gold -= 2;
            System.out.println(name + " throws 2 gold coins during " + proPossAdj + " journey to keep whatever is out there away. Now has " + gold + " in " + proPossAdj + " pouch."); 
            if (gold <= 0) {
                System.out.println(name + " ran out of gold and needs to return back before something bad happens.");
            }   
        }

        for (int tries = 1; tries <= 3; tries++) {      // First for loop
            System.out.println(name + " hears an eerie whisper... attempt " + tries + " has failed.");    
        }
        
        String elderBeing = "Leshy";        // Beginning of Project 3

        String[] inventory = {weapon, "bandage", "monster logbook", "map"};

        String[] creatures = {"goblin", "mysterious being", "wraith", elderBeing};

        String[] dialogueChoices = {"1. Attack the creature!", "2. Try to communicate peacefully.", "3. Attempt to sneak away quietly."};
        
        System.out.println();
        System.out.println("~ ~ ~ Player Inventory ~ ~ ~");
        for (String item : inventory) {
            System.out.println(name + " carries a " + item + ".");
        }
        
        System.out.println();
        System.out.println("~ ~ ~ Creatures Encountered ~ ~ ~");
        for (int i = 0; i < creatures.length; i++) {
            System.out.println("Creature " + (i + 1) + ": " + creatures[i]);
        }

        System.out.println();
        System.out.println("The " + elderBeing + "'s branches creak, and " + name + " must choose how to respond:");
        for (String choice : dialogueChoices) {
            System.out.println(choice);
        }

        System.out.print("Enter your choice (1-3): ");
        int playerChoice = in.nextInt();

        switch (playerChoice) {
            case 1:
                System.out.println(name + " raises " + proPossAdj + " " + weapon + " and charges at the " + elderBeing + "!");
                System.out.println(name + " gained 13 gold.");
                gold = gold + 13;
                break;
            case 2:
                System.out.println(name + " lowers " + proPossAdj + " weapon and speaks softly. The " + elderBeing + " tilts its head curiously...");
                System.out.println(name + " gained 25 gold.");
                gold = gold + 25;
                break;
            case 3:
                System.out.println(name + " steps back slowly, trying not to make a sound, before disappearing into the shadows.");
                System.out.println(name + " gained 20 gold.");
                gold = gold + 20;
                break;
            default:
                System.out.println("Confused and uncertain, " + name + " hesitates-and the " + elderBeing + " makes the first move leaving a serious ingury on the traveler!");
                break;
        }

        // Final Project called
        int randomIndex = pickRandomItem(inventory);
        System.out.println("Randomly selected inventory item: " + inventory[randomIndex]);

        int overallGold = posOrNegGold(gold, coinUsed);
        System.out.println("The overall amount of gold from gaining and losing on this adventure: " + overallGold);

        int validatedChoice = getValidatedChoice(in, 1, 3);
        System.out.println("Validated choice: " + validatedChoice);

        printInventory(inventory);

        printStatus(name);
        printStatus(name, gold);

        in.close();     // closes the scanner
    }

    // Final Project
    public static int pickRandomItem(String[] inventory) {
        int index = (int) (Math.random() * inventory.length);
        return index;
    }

    public static int posOrNegGold(int totalGold, int spentGold) {
        return totalGold - spentGold;
    }

    public static int getValidatedChoice(Scanner in, int min, int max) {
        int choice;
        do {
            System.out.print("As the " + "mysterious being" + " watches, choose your action wisely (" + min + "-" + max + "): ");
            while (!in.hasNextInt()) {
                System.out.print("That's not a proper choice! Pick a number between " + min + " and " + max + ": ");
                in.next();
            }
            choice = in.nextInt();
            if (choice < min || choice > max) {
                System.out.println("The " + "forest whispers" + " disapprove. Your choice must be between " + min + " and " + max + ".");
            }
        }   while (choice < min || choice > max);
        return choice;
    }

    public static void printInventory(String[] inventory) {
        System.out.println("~ Inventory Contents ~");
        for (String item : inventory) {
            System.out.println("- " + item);
        }
    }

    public static void printStatus(String name) {
        System.out.println(name + " continues adventuring!");
    }
    public static void printStatus(String name, int gold) {
        System.out.println(name + " has " + gold + " gold coins and continues adventuring!");
    }
}
