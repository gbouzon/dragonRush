import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends MyWorld
{
    private int time;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        prepare();
        time = 3000;
        showTime();
    }
    
    public void act() {
        countTime();
    }
    
    private void prepare() {
        tinyBabyDragon tinyBabyDragon = new tinyBabyDragon();
        addObject(tinyBabyDragon,216,19);
        tinyBabyDragon.setLocation(667,666);
        tinyBabyDragon.setLocation(126,203);
        tinyBabyDragon.setLocation(25,19);
        tinyEnemy tinyEnemy = new tinyEnemy();
        addObject(tinyEnemy,626,370);
        tinyEnemy.setLocation(557,24);
        tinyEnemy.setLocation(561,16);
        tinyEnemy.setLocation(474,45);
        tinyBabyDragon.setLocation(76,45);
        tinyEnemy.setLocation(474,59);
        tinyStarFruit tinyStarFruit = new tinyStarFruit();
        addObject(tinyStarFruit,373,142);
        tinyCherry tinyCherry = new tinyCherry();
        addObject(tinyCherry,548,330);
        tinyPlum tinyPlum = new tinyPlum();
        addObject(tinyPlum,259,303);
        tinyCherry.setLocation(833,482);
        Coins coins = new Coins();
        addObject(coins,544,327);
        Coins coins2 = new Coins();
        addObject(coins2,827,137);
        Coins coins3 = new Coins();
        addObject(coins3,148,590);
    }
    /**
     * Count down the game time and display it. Stop the game with a winning message when time is up.  
     */
    private void countTime() {
        time -= 1;
        showTime();
        if(time == 0) {
            showEndMessage();
            Greenfoot.stop();
        }
    }
    /**
     * Show the remaining game time on screen.
     */
    private void showTime() {
        showText("Time: " + time,1000,25);
    }
    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage() {
        showText("Time is up, YOU WIN!",540,410);
        showText("Your final score: " + score + " points",540,25);
    }
}
