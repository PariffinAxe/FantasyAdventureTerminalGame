package Weapons;

public class Staff extends Weapon {
  
  private int magickaCost;

  public Staff(StaffTypes weapon, Rarity rarity, int level){
    super(weapon.getBaseDamage()* rarity.getDamageMultipler()*level, rarity.name(), weapon.name());
    this.magickaCost = weapon.getMagickaCost();
  }

  public int getMagickaCost() {
    return magickaCost;
  }
}
