import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.*;
/**
 * Parent class for game levels. Defines common behaviour for game levels.
 * 
 * @author Giuliana Bouzon
 */
public abstract class MyWorld extends World{
    protected static int score;
    protected static double totalScore;
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
    }
    /**
     * Calculates percentage
     */
    protected int calculatePercentage(){
        return (int)((score/totalScore)*100);
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
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(score<0){
            Greenfoot.setWorld(new GameOverScreen());
        }
    }
}
