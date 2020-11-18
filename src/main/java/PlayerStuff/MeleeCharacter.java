package PlayerStuff;

import Weapons.Weapon;

public abstract class MeleeCharacter extends Character {
  
  private int stamina;
  private int maxStamina;
  
  public MeleeCharacter(Weapon weapon, String name, int stamina){
    super(weapon, name, 100);
    this.stamina = stamina;
    this.maxStamina = stamina;
  }

  @Override
  public void levelUp(int level) {
    for (int i = 0 ; i < level ; i++){
      super.increaseLevel();
      super.increaseMaxHealth();
      super.restoreMaxHealth();
      this.maxStamina = (int) Math.floor(this.maxStamina * 1.05);
      this.stamina = this.maxStamina;
    }
  }
  
}
