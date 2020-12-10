import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines Restart button's behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Restart extends Buttons {
    private String name = "restart";
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        mouseAnimation(name);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new MenuScreen());
            ((MyWorld)getWorld()).score = 0;
        }
    }
}
