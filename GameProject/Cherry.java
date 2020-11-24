import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author 
 * @version (a version number or a date)
 */
public class Cherry extends Fruits
{
    private int speed;
    public Cherry(){
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    public void detectClass(){
        if(getWorld().getClass() == Snake.class){
            setLocation(getX(), getY()+speed);
            if(isTouching(Ground.class)){
                ((MyWorld)getWorld()).addScore(-10);
                ((MyWorld)getWorld()).removeObject(this);
            }
        }
        else if(getWorld().getClass() == DinoRush.class){
            setLocation(getX()-1, getY());
        }
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
