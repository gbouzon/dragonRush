import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends Enemies
{
    
    public void act() 
    {  
    } 
    public void generateKnights(){
       List<Knight> list = new ArrayList<>();
       list.addAll(getWorld().getObjects(Knight.class));
       if(list.size() == 0){
           for(int i = 0; i<3;){
               getWorld().addObject(new Knight(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
           }
       }
    }
}
