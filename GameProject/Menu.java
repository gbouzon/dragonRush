import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines Menu button's behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Menu extends Buttons {
    private String name = "menu";
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        mouseAnimation(name);
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new MenuScreen());
        }
    }    
}
