package PlayerStuff;

import Weapons.HealingTool;
import Weapons.HealingToolTypes;
import Weapons.Rarity;

public class Cleric extends Healer {

  private boolean canMaxHeal;

  public Cleric(String name){
    super(new HealingTool(HealingToolTypes.LEECHES, Rarity.COMMON, 1), name);
    this.canMaxHeal = true;
  }
}
