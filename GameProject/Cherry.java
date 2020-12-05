import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Defines behaviour for the cherry objects in the game.
 * 
 * @author Giuliana Bouzon
 */
public class Cherry extends Fruits {
    public Cherry(){
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the Cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       detectClass();
    }    
}
