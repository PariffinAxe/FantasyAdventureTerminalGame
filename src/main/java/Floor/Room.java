package Floor;

import java.util.ArrayList;

public class Room {

  private RoomType roomType;
  private double enemyHealth = 10.0;
  private double enemyDamage = 1.0;

  public Room(int floor){
    RoomType[] roomTypes = RoomType.values();
    int size = roomTypes.length;
    int index = (int) Math.floor(Math.random()*size);
    this.roomType = roomTypes[index];
    this.enemyHealth = this.enemyHealth * (Math.pow(1.05, floor+1)) * roomType.getEnemyDifficulty();
    this.enemyDamage = this.enemyDamage * (Math.pow(1.05, floor+1)) * roomType.getEnemyDifficulty();
    roundDamageHealth();
  }

  public String getEnemies(){
    return roomType.getEnemyName();
  }

  public int getNoEnemies(){
    return roomType.getNoEnemies();
  }

  public void roundDamageHealth(){
    this.enemyHealth = Math.round(this.enemyHealth * 100) / 100;
    this.enemyDamage = Math.round(this.enemyDamage * 100) / 100;
  }

  public double getEnemyHealth() {
    return enemyHealth;
  }

  public double getEnemyDamage() {
    return enemyDamage;
  }
}
