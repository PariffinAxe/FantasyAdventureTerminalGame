import Floor.Enemy;
import Floor.Room;
import PlayerStuff.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Hi there. Welcome to your fantasy adventure. What is your name?");
    String playerName = in.next();
    System.out.println("And what would you like your starting barbarian to be called");
    String barbName = in.next();
    Player player = new Player(playerName, barbName);


    ArrayList<Room> rooms = player.getRooms();
    for (int i = 0 ; i < rooms.size(); i++){
      Room room = rooms.get(i);
      System.out.println("You have come across " + room.getRoomType().getEnemies());
      ArrayList<Enemy> enemies = room.getEnemies();
    }

  }
}
