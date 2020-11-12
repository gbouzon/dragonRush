import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BabyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyDragon extends Dragon
{
    private GreenfootImage[] dragonAttack;
    private GreenfootImage dragonIdle;
    private int index, counter;
    /**
     * Constructor for Baby Dragon class.
     */
    public BabyDragon(){
        MyWorld world = ((MyWorld)getWorld());
        world.makeArrays(dragonAttack, "dragonAttack", 4, index);
    }
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
