package PlayerStuff;

import Weapons.Weapon;

public abstract class Character {

  private final String name;
  private int xp;
  private int level;
  private Weapon weapon;
  private double health;
  private double maxHealth;

  public Character(Weapon weapon, String name, double health){
    this.weapon = weapon;
    this.name = name;
    this.health = health;
    this.maxHealth = health;
    this.xp = 0;
    this.level = 1;
  }

  public String getName() {
    return name;
  }

  public int getXp() {
    return xp;
  }

  public int getLevel() {
    return level;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public double getHealth() {
    return health;
  }

  public double getMaxHealth() {
    return maxHealth;
  }

  public void increaseXP(int xp) {
    this.xp += xp;
    if (this.xp >= 100){
      levelUp((int) Math.floor(this.xp / 100));
      this.xp = this.xp % 100;
    }
  }

  public abstract void levelUp(int level);

  public void increaseLevel(){
    this.level ++;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public void restoreHealth(double health) {
    this.health += health;
  }

  public void restoreMaxHealth() {
    this.health = maxHealth;
  }

  public void increaseMaxHealth(){
    this.maxHealth = this.maxHealth * 1.05;
  }

  public void takeDamage(double damage) {
    this.health -= damage;
  }
}
