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
        score=0;
    }
    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        countTime();
    }
    
    private void prepare() {
        BabyDragon tinyBabyDragon = new BabyDragon();
        scaleImage(tinyBabyDragon);
        addObject(tinyBabyDragon,59,36);
        Knight tinyEnemy = new Knight();
        scaleImage(tinyEnemy);
        addObject(tinyEnemy,414,37);

        StarFruit tinyStarFruit = new StarFruit();
        scaleImage(tinyStarFruit);
        addObject(tinyStarFruit,493,140);

        Cherry tinyCherry = new Cherry();
        scaleImage(tinyCherry);
        addObject(tinyCherry,833,482);
        Plum tinyPlum = new Plum();
        scaleImage(tinyPlum);
        addObject(tinyPlum,259,303);
        Coins coins = new Coins();
        scaleImage(coins);
        addObject(coins,503,340);
        Coins coins2 = new Coins();
        scaleImage(coins2);
        addObject(coins2,776,304);
        Coins coins3 = new Coins();
        scaleImage(coins3);
        addObject(coins3,143,643);
        Plum plum2 = new Plum();
        scaleImage(plum2);
        addObject(plum2,1015,115);
        StarFruit starFruit2 = new StarFruit();
        scaleImage(starFruit2);
        addObject(starFruit2,654,632);
        Coins coins4 = new Coins();
        scaleImage(coins4);
        addObject(coins4,97,361);
        Cherry cherry2 = new Cherry();
        scaleImage(cherry2);
        addObject(cherry2,290,147);
        Plum plum3 = new Plum();
        scaleImage(plum3);
        addObject(plum3,507,578);
        StarFruit starFruit3 = new StarFruit();
        scaleImage(starFruit3);
        addObject(starFruit3,986,360);
        Coins coins5 = new Coins();
        scaleImage(coins5);
        addObject(coins5,933,637);
        Cherry cherry3 = new Cherry();
        scaleImage(cherry3);
        addObject(cherry3,787,45);
        Coins coins6 = new Coins();
        scaleImage(coins6);
        addObject(coins6,640,203);
        countTime();
        removeObject(coins4);
    }

    /**
     * Scales the images to fit in the PacMan (maze is smaller than other classes).
     */
    private void scaleImage(Actor actor){
        GreenfootImage image = actor.getImage();
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
    
    /*
     * Show the end-of-game message on screen.
     
    private void showEndMessage() {
        showText("Time is up, YOU WIN!",540,410);
        showText("Your final score: "  + " points",540,25);
    }
    */
}
