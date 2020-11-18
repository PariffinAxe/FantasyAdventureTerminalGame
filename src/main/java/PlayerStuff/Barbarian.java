package PlayerStuff;

import Weapons.Melee;
import Weapons.MeleeTypes;
import Weapons.Rarity;

public class Barbarian extends MeleeCharacter {
  
  private double rage;

  public Barbarian(String name){
    super(new Melee(MeleeTypes.AXE, Rarity.COMMON, 1), name, 100);
    this.rage = 1.0;
  }

  public double getRage() {
    return rage;
  }

  public void setRage(double rage) {
    this.rage = rage;
  }
}
