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
    private ArrayList<Actor> list;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 700, 1); 
        list = new ArrayList<>();
    }
    /**
     * Method to make arrays with characters' pictures for the animation
     * @author Giuliana Bouzon
     */
    public GreenfootImage[] makeArrays(GreenfootImage[] array, String str, int size, int index){
        array = new GreenfootImage[size];
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
    public void checkObjects(java.lang.Class<Actor> cls){
        //to be fixed: make it add randomly (random fruits + coins)
       List<Actor> list = new ArrayList<>();
       list.addAll(getObjects(cls));
       if(list.size() == 0){
           addObject(new Fruits(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        }
    }
}
