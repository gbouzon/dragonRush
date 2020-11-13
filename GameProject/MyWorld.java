import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.*;
/**
 * Parent class for game levels.
 * 
 * @author Giuliana Bouzon
 * @version 1.0
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    /**
     * Method to make arrays with characters' pictures for the animation
     * @author Giuliana Bouzon
     */
    public GreenfootImage[] makeArrays(GreenfootImage[] array, String str, int index){
        index = 0;
        for(int i = 0; i<array.length; i++){
            array[i] = new GreenfootImage(str + (i+1) + ".png");
        }
        return array;
    }
    /**
     * Method to make characters' animation
     * @author Giuliana Bouzon
     */
    
    public void switchImage(GreenfootImage[] array, int index, Actor actor){
        actor.setImage(array[index % array.length]);
        index++;
    }
    /**
     * Adds more allies objects to the world when there are none.
     */
    public void checkObjects(){ //to be refactored
       List<Actor> list = new ArrayList<>();
       list.addAll(getObjects(Allies.class));
       if(list.size() == 0){
           for(int i = 0; i<5;){
               addObject(new Allies(), 1250, Greenfoot.getRandomNumber(500));
           }
        }
    }
}
