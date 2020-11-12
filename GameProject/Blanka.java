import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public Blanka(){
        MyWorld world = ((MyWorld)getWorld());
        world.makeArrays(blankaExplode,"blankaExplode",3, indexExplode);
        world.makeArrays(blankaPunch, "blankaPunch", 3, indexPunch);
        world.makeArrays(blankaWalking, "blankaWalking",5, indexWalking);
        
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
