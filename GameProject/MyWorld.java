import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.*;
/**
 * Parent class for game levels.
 * 
 * @author Giuliana Bouzon
 * @version 1.0
 */
public abstract class MyWorld extends World
{
   protected static int score;
   protected static int totalScore;
    /**
    * Constructor for objects of class MyWorld.
    * 
    */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 725, 1); 
        
    }
    /**
     * Calculates skill percentage of player based on allies collected.
     */
    public int calculatePercentage(){
        //to be used in gameOver condition
        int result = score/totalScore;
        return (result*100);
    }
    /**
    * Method to display the score in the upper left corner of the World.
    */
    public void showScore(){
        showText("Score: " + score, 80, 25);
    }
    /**
    * Adds points collected to the final score.
    */
    public void addScore(int points) {
        score += points;
        showScore();
    }

    /**
    * Checks if the player has lost the game (score is equal or smaller than zero)
    */
    public boolean isGameOver(int timer){ //to be fixed
        if(this.getClass() == PacMan.class && timer<3500 && score<0){
            return true;  
        }
        else if (this.getClass() !=PacMan.class && score<=0){
            return true;
        }
        return false;
    }
    /**
     * Resets the game in case player has lost or ends the game when the player has 
     * finished the last level and then displays results.
     */
    public void gameOver(int timer){// to be fixed
       if(this.getClass() == DinoRush.class && timer <=0){
            //Greenfoot.setWorld(new GameOverScreen()); --yet to be created
            score = 0;
            Greenfoot.stop();
            totalScore = 0;
       }
       else if(isGameOver(timer)){
            //Greenfoot.setWorld(new MenuScreen());  
            //restart the game or end here.
            //if player chooses to restart the game: score will be reset to 0;
       }
    }
}
