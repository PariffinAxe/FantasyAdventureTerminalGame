package PlayerStuff;

import java.util.ArrayList;

public class Player {

  private ArrayList<Character> characters;
  private String name;

  public Player(String name){
    this.name = name;
    this.characters = new ArrayList<Character>();
  }
  
  public void addCharacter(Character character){
    characters.add(character);
  }



}