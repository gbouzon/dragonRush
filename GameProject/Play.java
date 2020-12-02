import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Buttons
{
    private String name = "play";
    private int counter;
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseAnimation(name);
        if(!isTransition() && Greenfoot.mouseClicked(this)){
            getWorld().addObject(new TransitionScreen(),540,363);
        }
        //detectWorld();
    }
    private void detectWorld(){
        if(isTransition() && getWorld().getClass() == MenuScreen.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PacMan());
        }
        if(getWorld().getClass() == PacMan.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new ProperSnake());
        }
        if(getWorld().getClass() == ProperSnake.class && Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new DinoRush());
        }
    }
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
}
