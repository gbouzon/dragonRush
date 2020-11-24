import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tinyBabyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tinyBabyDragon extends Dragon
{
    private Color white;
    public int points;
    public tinyBabyDragon() {
        white = Color.WHITE;
        points = 0;
    }
    
    /**
     * Allows the user to control the game using the keys (w,a,s,d and right,left,up,down)
     */
    public void userControl() {
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
            if(touchingWalls()) {
                setLocation(getX() - 4, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
            if(touchingWalls()) {
                setLocation(getX() + 4, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
            if(touchingWalls()) {
                setLocation(getX(), getY() + 4);
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
            if(touchingWalls()) {
                setLocation(getX(), getY() - 4);
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
    }
    /**
     * Checks if the character is touching the walls of the maze
     */
    public boolean touchingWalls() {
        World world = (PacMan)getWorld();
        GreenfootImage background = world.getBackground();
        if (background.getColorAt(getX(), getY()).equals(white)) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Checks if the dragon eats the fruit. If it does, fruits will be removed, then points will be 
     * added to the overall score
     */
    public void eatFruits() {
        if(isTouching(tinyStarFruit.class)) {
            removeTouching(tinyStarFruit.class);
            Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(10);
        }
        if(isTouching(tinyPlum.class)) {
            removeTouching(tinyPlum.class);
            Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(20);
        }
        if(isTouching(tinyCherry.class)) {
            removeTouching(tinyCherry.class);
            Greenfoot.playSound("eat.wav");
            ((MyWorld)getWorld()).addScore(30);
        }
    }
    /**
     * Checks if the dragon touches a coin. If it does, coins will be removed, then points will be 
     * added to the overall score
     */
    public void winCoins() {
        if(isTouching(Coins.class)) {
            removeTouching(Coins.class);
            Greenfoot.playSound("coins.wav");
            ((MyWorld)getWorld()).addScore(50);
        }
    }
    /**
     * The player loses the game if the enemy touches the dragon
     */
    public void loseCondition() {
        if(isTouching(tinyEnemy.class)) {
            //Greenfoot.stop();
            //getWorld().showText("GAME OVER, YOU LOSE",540,410);
            ((MyWorld)getWorld()).score = -1;
        }
    }
    /**
     * Act - do whatever the tinyBabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        userControl();
        eatFruits();
        loseCondition();
        winCoins();
    }
}
