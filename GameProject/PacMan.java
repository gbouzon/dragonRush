 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 import java.util.*;
/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacMan extends MyWorld
{
    public int time;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public PacMan()
    {
        prepare();
        time = 3500;
        showTime();
        score=0;
        totalScore = 240;
    }
    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        countTime();
        checkKnights();
        if (score < 0) {
                Greenfoot.setWorld(new PacMan());
                score = 0;
        }
    }
    
    private void prepare() {
        BabyDragon tinyBabyDragon = new BabyDragon();
        scaleImage(tinyBabyDragon.getImage());
        addObject(tinyBabyDragon,59,36);
        Knight tinyEnemy = new Knight();
        scaleImage(tinyEnemy.getImage());
        addObject(tinyEnemy,414,37);

        StarFruit tinyStarFruit = new StarFruit();
        scaleImage(tinyStarFruit.getImage());
        addObject(tinyStarFruit,493,140);

        Cherry tinyCherry = new Cherry();
        scaleImage(tinyCherry.getImage());
        addObject(tinyCherry,833,482);
        Plum tinyPlum = new Plum();
        scaleImage(tinyPlum.getImage());
        addObject(tinyPlum,259,303);
        Coins coins = new Coins();
        scaleImage(coins.getImage());
        addObject(coins,503,340);
        Coins coins2 = new Coins();
        scaleImage(coins2.getImage());
        addObject(coins2,776,304);
        Coins coins3 = new Coins();
        scaleImage(coins3.getImage());
        addObject(coins3,143,643);
        Plum plum2 = new Plum();
        scaleImage(plum2.getImage());
        addObject(plum2,1015,115);
        StarFruit starFruit2 = new StarFruit();
        scaleImage(starFruit2.getImage());
        addObject(starFruit2,654,632);
        Coins coins4 = new Coins();
        scaleImage(coins4.getImage());
        addObject(coins4,97,361);
        Cherry cherry2 = new Cherry();
        scaleImage(cherry2.getImage());
        addObject(cherry2,290,147);
        Plum plum3 = new Plum();
        scaleImage(plum3.getImage());
        addObject(plum3,507,578);
        StarFruit starFruit3 = new StarFruit();
        scaleImage(starFruit3.getImage());
        addObject(starFruit3,986,360);
        Coins coins5 = new Coins();
        scaleImage(coins5.getImage());
        addObject(coins5,933,637);
        Cherry cherry3 = new Cherry();
        scaleImage(cherry3.getImage());
        addObject(cherry3,787,45);
        Coins coins6 = new Coins();
        scaleImage(coins6.getImage());
        addObject(coins6,640,203);
        countTime();
        removeObject(coins4);
        Restart restart = new Restart();
        addObject(restart,987,706);
        Knight knight2 = new Knight();
        addObject(knight2,832,383);
        removeObject(knight2);
        Knight knight3 = new Knight();
        scaleImage(knight3.getImage());
        addObject(knight3,830,392);
        Knight knight4 = new Knight();
        scaleImage(knight4.getImage());
        addObject(knight4,285,374);
        Knight knight5 = new Knight();
        scaleImage(knight5.getImage());
        addObject(knight5,810,133);
        Knight knight6 = new Knight();
        scaleImage(knight6.getImage());
        addObject(knight6,751,632);
    }

    /**
     * Scales the images to fit in the PacMan (maze is smaller than other classes).
     */
    public void scaleImage(GreenfootImage image){
        //GreenfootImage image = actor.getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
    }
    
    /**
     * Count down the game time and display it. Stop the game with a winning message when time is up.  
     */
    public void countTime() {
        time --;
        showTime();
        if(time == -100) {
            addObject(new TransitionScreen(),540,363);
        }
    }
    /**
     * Show the remaining game time on screen.
     */
    public void showTime() {
        if(time>=0){
            showText("Time: " + time,1000,25);
        }
    }
    /**
     * Checks if all the knights have left the world
     */
    public void checkKnights() {
        List<Knight> knights = getObjects(Knight.class);
        if(knights.size() == 0) {
            for (int i = 0; i < 6; i++) {
                Knight knight = new Knight();
                scaleImage(knight.getImage());
                addObject(knight,830,392);
            }
        }
    }
}
