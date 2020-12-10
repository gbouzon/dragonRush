import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines coin objects' behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Coins extends Actor {
    private int counter,speed, indexCoins;
    private GreenfootImage[] coins;
    /**
     * Constructor for Coins class.
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
    private void switchImage(){
       if(counter==4){
            setImage(coins[indexCoins % coins.length]);
            indexCoins++;
            counter = 0;
       }
       else{
            counter++;
       }
    }
    /**
     * Detects World to act accordingly
     */
    private void detectClass(){
        if(getWorld().getClass() == Snake.class){
            setLocation(getX(), getY()+speed);
            switchImage();
            if(isTouching(Ground.class)){
                ((MyWorld)getWorld()).addScore(-10);
                ((MyWorld)getWorld()).removeObject(this);
            }
        }
        else if(getWorld().getClass() == DinoRush.class){
            setLocation(getX()-1, getY());
            switchImage();
        }
    }
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        detectClass();
    }    
}
