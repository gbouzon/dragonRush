import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DBDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DBDragon extends Dragon
{
    int speed;
    int newTail = 60;
    /**
     * Act - do whatever the DBDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDBDragon();
        size();
        speed=3;
        tailInitial();
        
    }   
    
    public void size(){
        GreenfootImage image=getImage();
        int myNewHeight = (int)image.getHeight();
        int myNewWidth = (int)image.getWidth();
        image.scale(100, 75);
    }
    
    public void moveDBDragon()
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
    
    public void tailInitial(){
        newTail++;
        getWorld().addObject(new Tail(), getX()-25, getY()-25);
        
        if(isTouching (Cherry.class)){
            speed++;
        
        }
    }

}

