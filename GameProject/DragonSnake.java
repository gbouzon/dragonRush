import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonSnake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonSnake extends Dragon
{
    Fruits fruits = new Fruits();
    /**
     * Allows the player to move in the World
     */
    public void userControl(){
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 5, getY());
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 5, getY());
            
        }
    }
    /**
     * Allows player to gain points by eating the fruits
     */
    public void gainPoints() {
        if(isTouching(Fruits.class)) {
            removeTouching(Fruits.class);
            Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(10);
        }
        if(isTouching(Coins.class)){
            removeTouching(Coins.class);
            Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(30);
        }
    }
    /**
     * Act - do whatever the DragonSnake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        userControl();
        gainPoints();
    }    
}
