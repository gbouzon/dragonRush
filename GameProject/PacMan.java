import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacMan extends MyWorld
{
    private int time;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public PacMan()
    {
        prepare();
        time = 3500;
        showTime();
    }
    
    public void act() {
        countTime();
    }
    
    private void prepare() {
        tinyBabyDragon tinyBabyDragon = new tinyBabyDragon();
        addObject(tinyBabyDragon,59,36);
        tinyEnemy tinyEnemy = new tinyEnemy();
        addObject(tinyEnemy,414,37);

        tinyStarFruit tinyStarFruit = new tinyStarFruit();
        addObject(tinyStarFruit,493,140);
        tinyCherry tinyCherry = new tinyCherry();
        addObject(tinyCherry,833,482);
        tinyPlum tinyPlum = new tinyPlum();
        addObject(tinyPlum,259,303);
        Coins coins = new Coins();
        addObject(coins,503,340);
        Coins coins2 = new Coins();
        addObject(coins2,776,304);
        Coins coins3 = new Coins();
        addObject(coins3,143,643);
    }

    /**
     * Count down the game time and display it. Stop the game with a winning message when time is up.  
     */
    private void countTime() {
        time --;
        showTime();
        if(time == -100) {
            addObject(new TransitionScreen(),540,363);
        }
    }
    /**
     * Show the remaining game time on screen.
     */
    private void showTime() {
        if(time>=0){
            showText("Time: " + time,1000,25);
        }
    }
    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage() {
        showText("Time is up, YOU WIN!",540,410);
        showText("Your final score: " + score + " points",540,25);
    }
}
