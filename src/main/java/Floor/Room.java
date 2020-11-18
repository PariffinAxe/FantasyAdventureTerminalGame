package Floor;

import java.util.ArrayList;

public class Room {

  private RoomType roomType;
  private double enemyHealth = 10.0;
  private double enemyDamage = 1.0;
  private ArrayList<Enemy> enemies;

  public Room(int floor, boolean boss){
    RoomType[] roomTypes = RoomType.values();
    int size = roomTypes.length;
    int index = (int) Math.floor(Math.random()*size);
    this.roomType = roomTypes[index];
    this.enemyHealth = this.enemyHealth * (Math.pow(1.05, floor+1)) * roomType.getEnemyDifficulty();
    this.enemyDamage = this.enemyDamage * (Math.pow(1.05, floor+1)) * roomType.getEnemyDifficulty();
    if (boss){
      this.enemyHealth = this.enemyHealth * 5;
      this.enemyDamage = this.enemyDamage * 5;
    }
    enemies = new ArrayList<Enemy>();
    populateRoom();
  }

  private void populateRoom(){
    for (int i = 0 ; i < roomType.getNoEnemies() ; i++){
      Enemy enemy = new Enemy(roomType.getEnemyName(), this.enemyDamage, this.enemyHealth);
      enemies.add(enemy);
    }
  }

  public ArrayList<Enemy> getEnemies() {
    return enemies;
  }

  public RoomType getRoomType() {
    return roomType;
  }
}
