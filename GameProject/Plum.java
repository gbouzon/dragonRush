import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviour for the plum objects in the game.
 * 
 * @author Giuliana Bouzon
 */
public class Plum extends Fruits {
   /**
     * Constructor for Plum class
     */
   public Plum() {
        speed = Greenfoot.getRandomNumber(3) + 1;
   }
   /**
     * Act - do whatever the Plum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() {
        detectClass();
   }    
}
