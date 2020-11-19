import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Dragon here.
 * 
 * @author Chelsea Nadarajah-Chinniah
 * @version (a version number or a date)
 */
public class Dragon extends MyActor
{
    public Dragon(){
        //constructor
    }
    public void switchImage(GreenfootImage[] array, int index){
        setImage(array[index % array.length]);
        index++;
    }
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    } 
    /**
     * Coordinates the user's input keyboard keys with
     * @author Chelsea Nadarajah-Chinniah
     */
 protected void checkKeyPress() {
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("space")) {
             setLocation(getX(),getY());
        }
        if(Greenfoot.isKeyDown("X")) {
           setLocation(getX(),getY());
        }
    }
    protected void eat(){
        ((MyWorld)getWorld()).checkObjects();
        ((MyWorld)getWorld()).showScore();
        if(isTouching(Fruits.class)){
            Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(5);
            
            removeTouching(Fruits.class);
        }
        else if(isTouching(Coins.class)){
            Greenfoot.playSound("coins.wav");
            ((MyWorld)getWorld()).addScore(10);
            removeTouching(Coins.class);
        }
    }
    
}
