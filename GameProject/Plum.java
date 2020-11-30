import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Plum here.
 * 
 * @author 
 * @version (a version number or a date)
 */
public class Plum extends Fruits
{
   public Plum(){
        speed = Greenfoot.getRandomNumber(5)+1;
   }
   /**
     * Act - do whatever the Plum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
   {
        detectClass();
   }    
}
