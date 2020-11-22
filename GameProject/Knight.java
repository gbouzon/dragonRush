import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        GreenfootImage yup=getImage();
        int myNewHeight = (int)yup.getHeight();
        int myNewWidth = (int)yup.getWidth();
        yup.scale(myNewWidth, myNewHeight);
    }    
}
