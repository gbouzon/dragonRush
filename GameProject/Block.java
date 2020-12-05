import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines block objects' behaviour. 
 * 
 * @author Giuliana Bouzon
 */
public class Block extends Actor {
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX()-1,getY());
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }    
}
