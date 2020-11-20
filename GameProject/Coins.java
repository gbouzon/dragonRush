import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Allies
{
    private int counter;
    private int speed;
    /*
     * Constructor for Coins class
     
    public Coins(){
        speed = Greenfoot.getRandomNumber(5)+1;
        coins = new GreenfootImage[10];
        indexCoins = 0;
        for(int i = 0; i<coins.length; i++){
            coins[i] = new GreenfootImage("gold" + (i+1) + ".png");
        }
    }
    public void movingCoins() {
        setLocation(getX()-speed,getY());
        if (getX() == 0) {
            MyWorld myworld = (MyWorld)getWorld();
            myworld.removeObject(this);
        }
    }
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
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    }    
}
