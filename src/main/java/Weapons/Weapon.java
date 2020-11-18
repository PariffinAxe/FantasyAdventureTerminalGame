package Weapons;

public abstract class Weapon {

  private double damage;
  private String rarity;
  private String weaponType;

  public Weapon(double damage, String rarity, String weaponType){
    this.damage = damage;
    this.rarity = rarity;
    this.weaponType = weaponType;
  }

  public double getDamage(){
    return this.damage;
  }

  public String getRarity() {
    return rarity;
  }

  public String getWeaponType() {
    return weaponType;
  }
}
