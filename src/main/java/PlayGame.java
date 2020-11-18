import Floor.Room;

public class PlayGame {

  public static void main(String[] args) {

    Room room = new Room(4);
    System.out.println(room.getEnemies());
    System.out.println(room.getNoEnemies());
    System.out.println(room.getEnemyDamage());
    System.out.println(room.getEnemyHealth());

  }
}
