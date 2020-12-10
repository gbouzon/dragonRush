import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines Credits button's behaviour
 * 
 * @author Giuliana Bouzon
 */
public class Credits extends Buttons {
    private String name = "credits";
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        mouseAnimation(name);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new CreditsScreen());
        }
    }    
}
