import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines common behaviour for the fruit objects in the game (child classes).
 * 
 * @author Giuliana Bouzon
 */
public class Fruits extends Actor {
    protected int speed; 
    protected int random;
    /**
     * Detects class and defines the fruits' behaviour accordingly.
     */
    protected void detectClass(){
        if(getWorld().getClass() == Snake.class){
            setLocation(getX(), getY()+speed);
            if(isTouching(Ground.class)&& ((Snake)getWorld()).getTime()>0){
                ((MyWorld)getWorld()).addScore(-5);
                ((MyWorld)getWorld()).removeObject(this);
            }
        }
        else if(getWorld().getClass() == DinoRush.class){
            setLocation(getX()-1, getY());
            preventOverlap();
        }
    }
    /**
     * Prevents overlap
     */
    protected void preventOverlap(){
        random = (int)Math.random();
        if((isTouching(Block.class)||isTouching(Coins.class)) && random == 0){
            setLocation(getX()-1, getY()+1);
        }
        else if((isTouching(Block.class)||isTouching(Coins.class)) && random == 1){
            setLocation(getX()+1, getY()-1);
        }
    }
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        // Add your action code here.
    }
}
