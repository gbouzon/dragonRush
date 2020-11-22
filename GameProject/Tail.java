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
    public Tail()
    {
        GreenfootImage red= new GreenfootImage(25,25); //image 20 by 20 pixels
        red.setColor(Color.RED);
        red.fill();
        setImage(red);
    }
    public void act() 
    {
        newTail++;
        if (newTail>3)//So now the goal is to make the tail dissapear only remaining 3 boxes behind the original
         getWorld().removeObject(this);// So now the only way to add would be when the dragon eats.
        
    }    
}
