import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Allies
{
    private GreenfootImage[] coins;
    private int index, counter;
    /**
     * Constructor for Coins class
     */
    public Coins(){
        coins = new GreenfootImage[10];
        index = 0;
        for(int i = 0; i<coins.length; i++){
            coins[i] = new GreenfootImage("gold" + (i+1) + ".png");
        }
    }
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
