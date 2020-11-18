package PlayerStuff;

import Weapons.Weapon;

public abstract class Healer extends Character {

  public Healer(Weapon weapon, String name){
    super(weapon, name, 150);
  }

  @Override
  public void levelUp(int level) {
    for (int i = 0 ; i < level ; i++){
      super.increaseLevel();
      super.increaseMaxHealth();
      super.restoreMaxHealth();
    }
  }
}
