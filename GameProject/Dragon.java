import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Dragon here.
 * 
 * @author Chelsea Nadarajah-Chinniah
 * @version (a version number or a date)
 */
public class Dragon extends Actor
{
    protected GreenfootImage[] dragonA, dragonL, dragonR;
    protected int indexDragonA, indexDragonL, indexDragonR;
    /**
     * Constructor for Dragon class.
     */
    public Dragon(){
        dragonA = new GreenfootImage[5]; //make one array for each direction
        indexDragonA = 0;
        for(int i = 0; i<dragonA.length; i++){
            dragonA[i] = new GreenfootImage("dragonA" + (i+1) + ".png");
        }
        
        dragonL = new GreenfootImage[5];
        indexDragonL = 0;
        for(int i = 0; i<dragonL.length; i++){
            dragonL[i] = new GreenfootImage("dragonWL" + (i+1) + ".png");
        }
        
        dragonR = new GreenfootImage[5];
        indexDragonR = 0;
        for(int i = 0; i<dragonR.length; i++){
            dragonR[i] = new GreenfootImage("dragonWR" + (i+1) + ".png");
        }
        
    }
    /**
     * Animates the character's movements
     */
    public void switchImage(GreenfootImage[] array, int index){
        setImage(array[index % array.length]); 
        index++;
        //for some reason, doesn't work, check BabyDragon class userControl() method.
    }
    /**
     * Allows user to gain points by eating fruits and picking up coins
     */
    protected void eat(){
        if(isTouching(Fruits.class)){
             Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(10);
            removeTouching(Fruits.class);
        }
        else if(isTouching(Coins.class)){
            Greenfoot.playSound("coins.wav");
            ((MyWorld)getWorld()).addScore(30);
            removeTouching(Coins.class);
        }
        else if(isTouching(Knight.class)){
            //goes to restart screen yet to be created
            //to be used later in game over conditions.
            //((MyWorld)getWorld()).score = -1; 
        }
    }
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){

    } 
}
