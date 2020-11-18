package PlayerStuff;

import Weapons.Melee;
import Weapons.MeleeTypes;
import Weapons.Rarity;

public class Knight extends MeleeCharacter {


  public Knight(String name){
    super(new Melee(MeleeTypes.SWORD, Rarity.COMMON, 1), name, 100);
  }

  @Override
  public void takeDamage(double damage) {
    super.takeDamage(damage*0.5);
  }
  
}
