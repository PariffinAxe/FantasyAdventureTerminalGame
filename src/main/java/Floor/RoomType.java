package Floor;

public enum RoomType {
  FOREST("5 tricksy goblins", "Goblin", 5, 1),
  MOUNTAINS("a Mighty Dragon", "Dragon", 1, 20),
  SEA("a school of sharks", "Shark", 3, 4),
  PLAINS("a pack of wolves", "Wolf", 4, 2),
  SWAMP("a pair of large ogres", "Ogre", 2, 8);

  private final String enemyName;
  private final String enemies;
  private final int noEnemies;
  private final int enemyDifficulty;

  RoomType(String enemies, String enemyName, int noEnemies, int enemyDifficulty){
    this.enemies = enemies;
    this.enemyName = enemyName;
    this.noEnemies = noEnemies;
    this.enemyDifficulty = enemyDifficulty;
  }

  public String getEnemies() {
    return enemies;
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
