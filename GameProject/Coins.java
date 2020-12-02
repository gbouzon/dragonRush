import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Actor
{
    private int counter,speed, indexCoins;
    private GreenfootImage[] coins;
    /**
     * Constructor for Coins class
    */
    public Coins(){
        speed = Greenfoot.getRandomNumber(5)+1;
        coins = new GreenfootImage[10];
        indexCoins = 0;
        for(int i = 0; i<coins.length; i++){
            coins[i] = new GreenfootImage("gold" + (i+1) + ".png");
        }
    }
    /**
     * Method to create character animation.
     */
    public void switchImage(){
       if(counter==5){
            setImage(coins[indexCoins % coins.length]);
            indexCoins++;
            counter = 0;
       }
       else{
            counter++;
       }
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
        else if(getWorld().getClass() == ProperSnake.class){
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
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        detectClass();
    }    
}
