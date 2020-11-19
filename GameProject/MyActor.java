import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MyActor extends Actor
{
    protected int indexCoins,indexDragonA, indexDragonL, indexDragonR, indexFire;
    
    protected GreenfootImage[] coins,dragonA, dragonL, dragonR, fire;
    
    protected GreenfootImage dragonI;
    

     
    /**
     * Act - do whatever the MyActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
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
    protected void switchImage(GreenfootImage[] array, int index){
        setImage(array[index % array.length]);
        index++;
    }
}
