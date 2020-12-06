import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Defines Play button's behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Play extends Buttons {
    private String name = "play";
    private int counter;
    /**
     * Detects World to act accordingly
     */
    private void detectWorld(){
        // to be used at some point for something I don't remember.
        if(isTransition() && getWorld().getClass() == MenuScreen.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PacMan());
        }
        if(getWorld().getClass() == PacMan.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Snake());
        }
        if(getWorld().getClass() == Snake.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new DinoRush());
        }
    }
    /**
     * Checks if there is a transitionScreen object in the World.
     */
    private boolean isTransition(){
       List<Actor> objects = new ArrayList<Actor>();
       objects.addAll(getWorld().getObjects(TransitionScreen.class));
       if(objects.size()>0){
           return true;
       }
       else{
           return false;
       }
    }
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        mouseAnimation(name);
        if(!isTransition() && Greenfoot.mouseClicked(this)){
            getWorld().addObject(new TransitionScreen(),540,363);
        }
        //detectWorld();
    }
}
