package PlayerStuff;

import Weapons.Weapon;

public abstract class Sorcerer extends Character {

  private int magicka;
  private int maxMagicka;

  public Sorcerer(Weapon weapon, String name, int magicka){
    super(weapon, name, 75);
    this.magicka = magicka;
    this.maxMagicka = magicka;
  }

  public int getMagicka() {
    return magicka;
  }

  public int getMaxMagicka() {
    return maxMagicka;
  }

  public void rest() {
    this.magicka += 20;
  }

  public void increaseMaxMagicka(int maxMagicka) {
    this.maxMagicka = maxMagicka;
  }

  @Override
  public void levelUp(int level) {
    for (int i = 0 ; i < level ; i++){
      super.increaseLevel();
      super.increaseMaxHealth();
      super.restoreMaxHealth();
      this.maxMagicka = (int) Math.floor(this.maxMagicka * 1.05);
      this.magicka = this.maxMagicka;
    }
  }
}
