package Weapons;

public enum MeleeTypes {

  SWORD(9, 8),
  AXE(11, 12),
  CLUB(10, 10);
  
  private final int baseDamage;
  private final int staminaCost;
  
  MeleeTypes(int baseDamage, int staminaCost){
    this.baseDamage = baseDamage;
    this.staminaCost = staminaCost;
  }

  public int getBaseDamage() {
    return baseDamage;
  }
  
  public int getStaminaCost(){
    return staminaCost;
  }
  
  public String getName(){
    return name();
  }
}
