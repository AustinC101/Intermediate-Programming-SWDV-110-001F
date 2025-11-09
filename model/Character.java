package model;

public class Character {
  private String name;
  private String pronounSubj;
  private String pronounObj;
  private String pronounPossAdj;
  private int age;
  private int gold;
  private String role;

  public Character(String name, String pronounSubj, String pronounObj, String pronounPossAdj, int age, int gold, String role) {
    this.name = name;
    this.pronounSubj = pronounSubj;
    this.pronounObj = pronounObj;
    this.pronounPossAdj = pronounPossAdj;
    this.age = age;
    this.gold = gold;
    this.role = role;
  }    

  public String getName() { return name; }
  public String getPronounSubj() { return pronounSubj; }
  public String getPronounObj() { return pronounObj; }
  public String getPronounPossAdj () { return pronounPossAdj; }
  public int getAge() { return age; }
  public int getGold() { return gold; }
  public String getRole() { return role; }

  public void addGold(int amount) { this.gold += amount; }
  public void spendGold(int amount) { this.gold -= amount; }
}
