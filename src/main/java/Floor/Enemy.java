package Floor;

public class Enemy {

  private double damage;
  private double health;
  private String name;

  public Enemy(String name, double damage, double health){
    this.name = name;
    this.damage = Math.round(damage*100);
    this.health = Math.round(health);
    this.damage = this.damage / 100;
  }

  public double getDamage() {
    return damage;
  }

  public double getHealth() {
    return health;
  }

  public String getName() {
    return name;
  }
}
