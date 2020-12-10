import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviour for the starfruit objects in the game.
 * 
 * @author Giuliana Bouzon
 */
public class StarFruit extends Fruits {
    /**
     * Constructor for StarFruit class
     */
    public StarFruit(){
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the StarFruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        detectClass();
    }    
}
