package Weapons;

public enum HealingToolTypes {

  CHIMES(10),
  HOLYWATER(6),
  LEECHES(2),
  POTION(3);
  
  private final int baseDamage;
  
  HealingToolTypes(int baseDamage){
    this.baseDamage = baseDamage;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public String getName(){
    return name();
  }
}
