package Floor;

public enum RoomType {
  FOREST("5 tricksy goblins",5, 1),
  MOUNTAINS("A Mighty Dragon", 1, 20),
  SEA("A school of sharks", 3, 4),
  PLAINS("A pack of wolves", 4, 2),
  SWAMP("A pair of large ogres", 2, 8);

  private final String enemyName;
  private final int noEnemies;
  private final int enemyDifficulty;

  RoomType(String enemyName, int noEnemies, int enemyDifficulty){
    this.enemyName = enemyName;
    this.noEnemies = noEnemies;
    this.enemyDifficulty = enemyDifficulty;
  }

  public String getEnemyName() {
    return enemyName;
  }

  public int getNoEnemies() {
    return noEnemies;
  }

  public int getEnemyDifficulty() {
    return enemyDifficulty;
  }

  public String getName(){
    return name();
  }
}
