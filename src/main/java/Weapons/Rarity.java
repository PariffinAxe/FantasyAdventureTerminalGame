package Weapons;

public enum Rarity {
  COMMON(1.0),
  UNCOMMON(1.2),
  RARE(1.4),
  EPIC(1.6),
  LEGENDARY(1.8),
  MYTHIC(2.0);

  private final double damageMultipler;

  Rarity(double damageMultipler){
    this.damageMultipler = damageMultipler;
  }

  public double getDamageMultipler() {
    return damageMultipler;
  }

  public String getType(){
    return name();
  }
}
