package PlayerStuff;

import Weapons.Melee;
import Weapons.MeleeTypes;
import Weapons.Rarity;

public class Paladin extends MeleeCharacter {
  
  private boolean canUseAura;

  public Paladin(String name){
    super(new Melee(MeleeTypes.CLUB, Rarity.COMMON, 1), name, 100);
    this.canUseAura = true;
  }
  
  
  
}
