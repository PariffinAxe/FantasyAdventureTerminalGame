package PlayerStuff;

import Weapons.Rarity;
import Weapons.Staff;
import Weapons.StaffTypes;

public class Wizard extends Sorcerer {

  private boolean canUseFirePower;

  public Wizard(String name){
    super(new Staff(StaffTypes.FIREBALL, Rarity.COMMON, 1), name, 100);
    this.canUseFirePower = true;
  }

}
