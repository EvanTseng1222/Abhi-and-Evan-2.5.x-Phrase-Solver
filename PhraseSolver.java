/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver
{
  /* your code here - attributes */
  boolean solved;
  /* your code here - constructor(s) */ 
  /**
   * Author: Evan Tseng and Abhi Paranthanate
   * Date: 11/1/2023
   * ver 1.0
   * @param none
   * just setting the variables in phrase solver
   */
  public PhraseSolver() {
    Player p1 = new Player();
    //Player p2 = new Player();
    Board board = new Board();
    boolean solved =  false;
  }

/**
 * Author: Evan Tseng and Abhi Paranthanate
 * Date: 11/1/2023
 * @param none
 * gets user input and checks whether or not it is the answer and ends game if it is
 * ver 1.o
 */
  public void play()
  {
    Board board = new Board();
    boolean solved = false;
    int currentPlayer = 1;

    Scanner guess = new Scanner(System.in);
    String letter = guess.nextLine();
    // System.out.println(letter);
    
    //boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      board.guessLetter(letter);
      letter = guess.nextLine();
      
      
      
      solved = true; 
      System.out.println("You won!");
      
    } 
   
  }
  
}