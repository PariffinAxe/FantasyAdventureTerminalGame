package Weapons;

public enum StaffTypes {
  
  FIREBALL(9, 8),
  ICE(10, 10),
  LIGHTNING(11, 12),
  WIND(12, 14);
  
  private final int baseDamage;
  private final int magickaCost;
  
  StaffTypes(int baseDamage, int magickaCost){
    this.baseDamage = baseDamage;
    this.magickaCost = magickaCost;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getMagickaCost() {
    return magickaCost;
  }

  public String getName(){
    return name();
  }
}
