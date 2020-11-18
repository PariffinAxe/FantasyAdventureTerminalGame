package PlayerStuff;

import Floor.Room;

import java.util.ArrayList;

public class Player {

  private ArrayList<Room> rooms;
  private ArrayList<Character> characters;
  private String name;

  public Player(String name, String barbName){
    this.name = name;
    this.characters = new ArrayList<Character>();
    this.characters.add(new Barbarian(barbName));
    this.rooms = new ArrayList<Room>();
    this.rooms.add(new Room(0, false));
  }
  
  public void addCharacter(Character character){
    characters.add(character);
  }

  public void addRoom(int floor){
    if ((floor+1) % 10 == 0){
      this.rooms.add(new Room(floor, true));
    } else {
      this.rooms.add(new Room(floor, false));
    }
  }

  public ArrayList<Room> getRooms() {
    return rooms;
  }

  public ArrayList<Character> getCharacters() {
    return characters;
  }

  public String getName() {
    return name;
  }
}