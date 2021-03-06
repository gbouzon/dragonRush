import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviour for Dragon class' child classes.
 * 
 * @author Chelsea Nadarajah-Chinniah, Giuliana Bouzon
 */
public class Dragon extends Actor {
    protected GreenfootSound coins, eat;
    /**
     * Constructor for Dragon class.
     */
    public Dragon() {
        coins = new GreenfootSound("coins.wav");
        eat = new GreenfootSound("eat.wav");
    }
    /**
     * Animates the character's movements
     */
    public void switchImage(GreenfootImage[] array, int index) {
        setImage(array[index % array.length]); 
    }
    /**
     * Allows user to gain points by eating fruits and picking up coins
     */
    protected void eat() {
        if (isTouching(Fruits.class)) {
            eat.play();
            ((MyWorld) getWorld()).addScore(10);
            removeTouching(Fruits.class);
        }
        else if (isTouching(Coins.class)) {
            coins.play();
            ((MyWorld) getWorld()).addScore(30);
            removeTouching(Coins.class);
        }
        else if (isTouching(Knight.class)) {
            Greenfoot.playSound("touchingKnight.wav");
            getWorld().addObject(new Record(), getX() + 20, getY());
            ((MyWorld) getWorld()).addScore(-20);
            removeTouching(Knight.class);
        }
    }
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        //act method here
    } 
}
