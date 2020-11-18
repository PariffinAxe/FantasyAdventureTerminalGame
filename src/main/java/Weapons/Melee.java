package Weapons;

public class Melee extends Weapon {
  
  private int staminaCost;

  public Melee(MeleeTypes weapon, Rarity rarity, int level){
    super(weapon.getBaseDamage()* rarity.getDamageMultipler()*level, rarity.name(), weapon.name());
    this.staminaCost = weapon.getStaminaCost();
  }

  public int getStaminaCost() {
    return staminaCost;
  }
}
