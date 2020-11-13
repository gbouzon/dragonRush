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
    private GreenfootImage[] dragonWalkLeft;
    private GreenfootImage[] dragonWalkRight;
    private GreenfootImage dragonIdle;
    private int indexAttack, indexLeft, indexRight, counter;
    /**
     * Constructor for Baby Dragon class.
     */
    public BabyDragon(){ //to be refactored using methods
        dragonIdle = new GreenfootImage("dragonIdle.png");
        
        dragonAttack = new GreenfootImage[5];
        indexAttack = 0;
        for(int i = 0; i<dragonAttack.length; i++){
            dragonAttack[i] = new GreenfootImage("dragonAttack" + (i+1) + ".png");
        }
        
        dragonWalkLeft = new GreenfootImage[5];
        indexLeft = 0;
        for(int i = 0; i<dragonWalkLeft.length; i++){
            dragonWalkLeft[i] = new GreenfootImage("dragonWalkLeft" + (i+1) + ".png");
        }
        
        dragonWalkRight = new GreenfootImage[5];
        indexRight = 0;
        for(int i = 0; i<dragonWalkRight.length; i++){
            dragonWalkRight[i] = new GreenfootImage("dragonWalkRight" + (i+1) + ".png");
        }
    }
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //example of using the animation method. Put this in your control method.
        ((MyWorld)getWorld()).switchImage(dragonAttack, indexAttack, this);
    }    
}
