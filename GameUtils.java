package utils;

import java.util.Random;
import java.util.Scanner;

public class GameUtils {
  public static int pickRandomItem(String[] items) {
    return new Random().nextInt(items.length);
  }

  public static int getValidatedChoice(Scanner in, int min, int max) {
    int choice;
    do {
      System.out.print("Choose an option (" + min + "-" + max + "): ");
      while (!in.hasNextInt()) {
        System.out.print("Invalid input. Enter a number between " + min + " and " + max + ": ");
        in.next();
      }
      choice = in.nextInt();
    }  while (choice < min || choice > max);
    return choice;
  }

  public static void printInventory(String[] inventory) {
    System.out.println("\n~ Inventory ~");
    for (String item : inventory) {
      System.out.println("- " + item);
    }
  }
}
