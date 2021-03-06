import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines the behaviour of Record objects.
 * 
 * @author Giuliana Bouzon
 */
public class Record extends Actor {
    private int counter = 0;
    /**
     * Act - do whatever the Record wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (counter == 100) {
            getWorld().removeObject(this);
        }
        counter++;
    }    
}
