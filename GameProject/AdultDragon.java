import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class AdultDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdultDragon extends Dragon
{
    public AdultDragon()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = myImage.getHeight()*2;
        int myNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    /**
     * Act - do whatever the AdultDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeypress();
        move(0);
    }    
    
    public void checkKeypress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
             setLocation(getX(), getY()-20);
        }
        if(Greenfoot.isKeyDown("down"))
        {
        setLocation(getX(), getY()+20);
        }
        if(Greenfoot.isKeyDown("left"))
        {
        setLocation(getX()-20, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
        setLocation(getX()+20, getY());
        }
        animateOnMove();
    }
    
    private GreenfootImage myImage = getImage();
    private String[] imageNames = {"GG1.png","GG2.png","GG3.png"};
    private int currentImage = 0;
    int xPos;
    int yPos;
    public void addedToWorld(World w)
    {
        xPos=getX();
        yPos=getY();
    }
    
    private void animateOnMove()
    {
        if(getX()!=xPos || getY()!=yPos)   //if it moves to the right
        {
            currentImage++;
            if(currentImage>=3)   //reset to 0 once you get past the last image
            currentImage=0;
            
            GreenfootImage newImage= new GreenfootImage(imageNames[currentImage]);
            if(getX()<xPos)
             newImage.mirrorHorizontally();
             
            setImage(newImage);
            myImage=getImage();
            
        }
        xPos=getX();
        yPos=getY();
    }
}
