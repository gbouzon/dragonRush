import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author Chelsea Nadarajah-Chinniah
 * @version (a version number or a date)
 */
public class Dragon extends Actor
{
    private boolean onGround = true;
    private int gravity;
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gravity--;
        setLocation(getX(), getY() - gravity);
        checkForJump();
    } 
    /**
     * Coordinates the user's input keyboard keys with
     * @author Chelsea Nadarajah-Chinniah
     */
    private void checkKeyPress(GreenfootImage[] array, int index, Actor actor) {
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX()-5,getY());
            ((MyWorld)getWorld()).switchImage(array, index, actor);
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+5,getY());
            ((MyWorld)getWorld()).switchImage(array, index, actor);
        }
        if(onGround && Greenfoot.isKeyDown("space")) {
           checkForJump();
           ((MyWorld)getWorld()).switchImage(array, index, actor);
        }
        if(Greenfoot.isKeyDown("X")) {
           setLocation(getX(),getY());
        }
    }
    private void checkForJump()
    {
    Actor a = getOneIntersectingObject(Ground.class);
    if (a != null) {
         gravity = 20;
    }
    }
    
}
