import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Dragon
{
    int newTail=0;
    int moreTail=70;
    
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Color();
        OriginalOne();
        
    }    
    
    public void Color(){
        GreenfootImage red= new GreenfootImage(10,10); //image 20 by 20 pixels
        red.setColor(Color.RED);
        red.fill();
        setImage(red);
    }
    
    public void OriginalOne(){
        newTail++;
        moreTail=70;
        if (newTail>moreTail)
         getWorld().removeObject(this);
        
    }
    
    
}
