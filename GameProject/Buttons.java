import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    protected boolean isMouseOver;
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    protected void mouseAnimation(String str){
        if(!isMouseOver && Greenfoot.mouseMoved(this)){
            setImage(str + "W.png");
            isMouseOver = true;
        }
        if(isMouseOver && Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            setImage(str +  "R.png");
            isMouseOver = false;
        }
    }
}
