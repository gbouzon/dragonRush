import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Cherry here.
 * 
 * @author 
 * @version (a version number or a date)
 */
public class Cherry extends Fruits
{
    public Cherry(){
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the Cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       detectClass();
    
    }    
}
