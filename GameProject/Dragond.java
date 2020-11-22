import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragond extends Dragon
{
    int newTail = 0;
    int speed=1; //I'll imput a method to change the speed later.
    int usedForSpeed=0;
    public Dragond()
    {
        setRotation(270); //start the game upwards
        GreenfootImage image=getImage();
        int myNewHeight = (int)image.getHeight();
        int myNewWidth = (int)image.getWidth();
        image.scale(myNewWidth, myNewHeight);
        
        
        
    }
    public void act() 
    {
        Dragon tail=new Tail();
        moveDragon();
        eatKnight();
        
        newTail++;
        getWorld().addObject(new Tail(), getX(), getY());
        // if the score gets to one point I want to change the image of the dragon head to something else.
    
    }    
    public void tailInitial(){
        newTail++;
        getWorld().addObject(new Tail(), getX(), getY());
        
    }
    public void moveDragon()
    {
          move(speed);
         if (Greenfoot.isKeyDown("d")){
        setRotation(0);
        }
        if (Greenfoot.isKeyDown("w")){
        setRotation(270);
        }
        if (Greenfoot.isKeyDown("a")){
        setRotation(180);
        }
        if (Greenfoot.isKeyDown("s")){
        setRotation(90);
        } 
        
    }
    public void eatKnight()
    {
        if (isTouching(Knight.class)){
            removeTouching(Knight.class);
            newTail++;
            World world=new Snake();
            //world.dragonScore.addScore();
            
            //world.addKnight();
            usedForSpeed++;
            
        }
        /*if (Greenfoot.isKeyDown("a") && isTouching(Knight.class)){
            setImage("Dragon4");
        }
        if (Greenfoot.isKeyDown("w") && isTouching(Knight.class)){
            setImage("Dragon4");
        }
        if (Greenfoot.isKeyDown("s") && isTouching(Knight.class)){
            setImage("Dragon3");
        }
        if (Greenfoot.isKeyDown("d") && isTouching(Knight.class)){
            setImage("Dragon3");
        }
        */ //I'll do this part later
    }
}
