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
        showScore();
    }
    /**
     * Increment totalScore based on allies collected.
     */
    protected void incrementTotalScore(int points){
        totalScore+=points;
        showPercentage();
    }
    /**
     * Display skill percentage of the player.
     */
    protected void showPercentage(){
        showText("Performance: " + ((score/totalScore)*100), 80, 40);
    }
    /**
    * Method to display the score in the upper left corner of the World.
    */
    protected void showScore(){
        showText("Score: " + score, 80, 25);
    }
    /**
    * Adds points collected to the final score.
    */
    protected void addScore(int points) {
        score += points;
        showScore();
    }
    /**
     * Scales the images to fit in the PacMan (maze is smaller than other classes).
     */
    protected void scaleImage(GreenfootImage image){
        //GreenfootImage image = actor.getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
    }
    /**
     * Checks if there are any knights in the World.
     */
    public boolean isKnightIn() {
        List<Knight> knights = getObjects(Knight.class);
        if(knights.size() != 0) {
            return true;
        }
        return false;
    }
    /**
     * Adds more knight objects to the World when there are none left.
     */
    protected void makeKnights(){
        if(!isKnightIn()){
            for (int i = 0; i < 6; i++) {
                Knight knight = new Knight();
                scaleImage(knight.getImage());
                addObject(knight,830,392);
            }
        }
    }
    /**
     * Ends the game when the player has  
     * finished the last level and then displays results.
     */
    public void gameOver(){
        
        
    }
}
