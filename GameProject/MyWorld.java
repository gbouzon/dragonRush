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
    public int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    public void checkObjects(){ //to be refactored
       List<MyActor> list = new ArrayList<>();
       list.addAll(getObjects(Allies.class));
       if(list.size() == 0){
           for(int i = 0; i<5;){
               addObject(new Coins(), 1250, Greenfoot.getRandomNumber(500));
           }
       }
    }
    public void showScore(){
        showText("Score: " + score, 80, 25);
    }
    public void addScore(int points) {
        score +=points;
        showScore();
        
    }
}
