package Weapons;

public class HealingTool extends Weapon {

  public HealingTool(HealingToolTypes weapon, Rarity rarity, int level){
    super(weapon.getBaseDamage()* rarity.getDamageMultipler()*level, rarity.name(), weapon.name());
  }

}
