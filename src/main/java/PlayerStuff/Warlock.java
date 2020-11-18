package PlayerStuff;

import Weapons.Rarity;
import Weapons.Staff;
import Weapons.StaffTypes;

public class Warlock extends Sorcerer {
  
  private boolean canUseEarthPower;

  public Warlock(String name){
    super(new Staff(StaffTypes.LIGHTNING, Rarity.COMMON, 1), name, 100);
    this.canUseEarthPower = true;
  }
  
}
