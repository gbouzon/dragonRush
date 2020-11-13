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
        hulkSmash = new GreenfootImage[6];
        indexSmash = 0;
        for(int i = 0; i<hulkSmash.length; i++){
            hulkSmash[i] = new GreenfootImage("hulkSmash" + (i+1) + ".png");
        }
        
        hulkWalking = new GreenfootImage[5];
        indexWalking = 0;
        for(int i = 0; i<hulkWalking.length; i++){
            hulkWalking[i] = new GreenfootImage("hulkWalking" + (i+1) + ".png");
        }


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
