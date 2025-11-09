package story;

import model.Character;

public class Story {
  public void prologue(Character player) {
    System.out.println("\n~ ~ ~ Adventure Prologue ~ ~ ~");
    System.out.println(player.getName() + " set out at dawn, " + player.get PronounPossAdj() + " pack light and hopes high.");
    System.out.println("At only " + player.getAge() + " years old, " + player.getPronounSubj() + " already carries stories most dare not tell.");
    System.out.println("A pouch with " + player.getGold() + " gold coins jingles at " + player.getPronounPossAdj() + " side.");
    System.out.println("The Whispering Woods wait ahead, their shadows deep and their secrets older than time.");
  }    

  public void encounter(Character player, String creature) {
    System.out.println("\nA " + creature + " emerges from the mist!");
    System.out.println(player.getName() + " grips " + player.getPronounPossAdj() + " weapon, ready for battle.");
  }

  public void shrineOfEchos(Character player) {
    System.out.println("\n~ ~ ~ The Shrine of Echoes ~ ~ ~");
    System.out.println("After hours of walking, " + player.getName() + " discovers ancient ruins hidden beneath vines.");
    System.out.println("Strange whispers call " + player.getPronounObj() + " closer, each echo sounding like " + player.getPronounPossAdj() + " own voice.");
    System.out.println("On an altar rests a glowing gem. As " + player.getPronounSubj() + " reaches out, the gem dissolves into light and seeps into " + player.getPronounPossAdj() + " skin.");
    System.out.println("Memories flood " + player.getPronounObj() + " mind-visions of heroes past and battles long forgotten.");
    System.out.println(player.getName() + " feels a surge of power and gains 30 gold as a gift from the ancient spirits.");
    player.addGold(30);
  }
}
