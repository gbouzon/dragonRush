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
        MyWorld world = ((MyWorld)getWorld());
        world.makeArrays(coins, "gold", 10, index);

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
