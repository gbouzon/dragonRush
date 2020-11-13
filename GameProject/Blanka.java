import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Blanka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blanka extends Enemies
{
    private GreenfootImage[] blankaExplode;
    private GreenfootImage[] blankaPunch;
    private GreenfootImage[] blankaWalking;
    private int indexExplode, indexPunch, indexWalking, counter;
    /**
     * Constructor for Blanka class.
     */
    public Blanka(){ //to be refactored
        blankaExplode = new GreenfootImage[3];
        indexExplode = 0;
        for(int i = 0; i<blankaExplode.length; i++){
            blankaExplode[i] = new GreenfootImage("blankaExplode" + (i+1) + ".png");
        }
        
        blankaPunch = new GreenfootImage[3];
        indexPunch = 0;
        for(int i = 0; i<blankaPunch.length; i++){
            blankaPunch[i] = new GreenfootImage("blankaPunch" + (i+1) + ".png");
        }
        
        blankaWalking = new GreenfootImage[5];
        indexWalking = 0;
        for(int i = 0; i<blankaWalking.length; i++){
            blankaWalking[i] = new GreenfootImage("blankaWalking" + (i+1) + ".png");
        }

        
    }
    /**
     * Act - do whatever the Blanka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
