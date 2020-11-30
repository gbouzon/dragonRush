import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines Restart button's behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Restart extends Buttons
{
    private String name = "restart";
    //private World world = getWorld();
    /**
     * Detects class to act accordingly.
     */
    private void detectClass(){
        if(getWorld().getClass() == PacMan.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PacMan());
        }
        if(getWorld().getClass() == Snake.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Snake());
        }
        if(getWorld().getClass() == DinoRush.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new DinoRush());
        }
    }
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //for now restart the whole game. Decide later which one to implement.
        mouseAnimation(name);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PacMan());
            ((MyWorld)getWorld()).score = 0;
        }
    }
}
