/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) */ 
  /**
   * Author: Evan Tseng and Abhi Paranthanate
   * Date: 11/1/2023
   * @param none
   * Has the user input their name and that name will be used
   * @return a string message that welcomes the player
   */
  public Player() {
    System.out.println("Enter Player Name:");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    points = 0;
    System.out.println("hello and welcome " + getName());
  }
/**
 * Author: Evan Tseng and Abhi Paranthante
 * Date: 11/1/2023
 * @param inputName
 * @return a string message that welcomes the player
 */
  public Player(String inputName){
    int points = 0;
    name = inputName;
    System.out.println("Hello and welcome to our game " + name);
  }

    /* your code here - accessor(s) */ 
  public String getName() {
    return name;
  }

  public int getPoints(){
    return points;
  }

  /* your code here - mutator(s) */ 

  public void setName(String inputName) {
    name = inputName;
  }

  public void addToPoints(int value) {
    points += value;
  }



}