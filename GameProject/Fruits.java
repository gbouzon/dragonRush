import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines the fruits' behaviour.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruits extends Actor
{
    protected int speed;
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    /**
     * Detects class and defines the fruits' behaviour accordingly.
     */
    protected void detectClass(){
        if(getWorld().getClass() == Snake.class){
            setLocation(getX(), getY()+speed);
            if(isTouching(Ground.class)&& ((Snake)getWorld()).getTime()>0){
                ((MyWorld)getWorld()).addScore(-10);
                ((MyWorld)getWorld()).removeObject(this);
            }
        }
        else if(getWorld().getClass() == DinoRush.class){
            setLocation(getX()-1, getY());
        
        }
        else if(getWorld().getClass() == DinoRush.class){
            setLocation(getX()-1, getY());
        }else if(getWorld().getClass() == ProperSnake.class){
            setLocation(getX(), getY()+speed);
            if(isTouching (line.class)){
                ((MyWorld)getWorld()).addScore(-5);
                ((MyWorld)getWorld()).removeObject(this);
            }
            else if(isTouching (DBDragon.class)){
                ((MyWorld)getWorld()).addScore(+10);
                ((MyWorld)getWorld()).removeObject(this);
                
        }
     }
   }
}
