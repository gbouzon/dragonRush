import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines common behaviour for button objects (child classes).
 * 
 * @author Giuliana Bouzon
 */
public class Buttons extends Actor {
    protected boolean isMouseOver;
    /**
      * Animates button when mouse hovers over it.
      */  
    protected void mouseAnimation(String str) {
        if (!isMouseOver && Greenfoot.mouseMoved(this)) {
            setImage(str + "W.png");
            isMouseOver = true;
        }
        if (isMouseOver && Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage(str +  "R.png");
            isMouseOver = false;
        }
    }
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }
}
