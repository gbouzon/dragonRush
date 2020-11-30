import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class StarFruit here.
 * 
 * @author 
 * @version (a version number or a date)
 */
public class StarFruit extends Fruits
{
    public StarFruit(){
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the StarFruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectClass();
    }    
}
