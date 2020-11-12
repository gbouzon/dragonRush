import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hulk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hulk extends Enemies
{
    private GreenfootImage[] hulkSmash;
    private GreenfootImage[] hulkWalking;
    private int indexSmash, indexWalking, counter;
    /**
     * Constructor for Hulk class.
     */
    public Hulk(){
        MyWorld world = ((MyWorld)getWorld());
        world.makeArrays(hulkSmash, "hulkSmash", 6, indexSmash);
        world.makeArrays(hulkWalking, "hulkWalking", 5, indexWalking);

    }
    /**
     * Act - do whatever the Hulk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
