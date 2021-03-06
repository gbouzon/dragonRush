import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Provides everything in level 3 of the game (Dino Rush).
 * 
 * @author Giuliana Bouzon
 */
public class DinoRush extends MyWorld {
    private int time, counter, height, height2, random;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public DinoRush() {
        counter = 0;
        time = 3500;
        showTime();
        prepare();
        setPaintOrder(Border.class, BabyDragon.class, Coins.class, Fruits.class);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Border border = new Border();
        addObject(border, 1254, 358);
        
        Border border2 = new Border();
        addObject(border2, 22, 359);
        
        BabyDragon babyDragon = new BabyDragon();
        addObject(babyDragon, 226, 536);
        
        Ground ground = new Ground();
        addObject(ground, 541, 654);

        Restart restart = new Restart();
        addObject(restart, 888, 692);
    }
    /**
     * Count down the game time and display it. Stop the game with a winning message when time is up.  
     */
    private void countTime() {
        time --;
        showTime();
        if (time == -100) {
            Greenfoot.setWorld(new GameOverScreen());
        }
    }
    /**
     * Show the remaining game time on screen.
     */
    private void showTime() { 
        if (time >= 0) {
            showText("Time: " + time, 1000, 25);
        }
    }
    /**
     * Adds blocks to the World according to defined rules.
     */
    private void makeTiles() {
        height = Greenfoot.getRandomNumber(400);
        for (int i = 0; i < 4; i++) {
            addObject(new Block(), i * 49 + 1000, 482 - height);
        }
    }
    /**
     * Adds allies to World according to defined rules.
     */
    private void addAllies() {
        if (Greenfoot.getRandomNumber(200) < 0.5) {
               addObject(new StarFruit(), 1079, 500 - height2);
               incrementTotalScore(10);
        }
        if (Greenfoot.getRandomNumber(200) < 0.5) {
               addObject(new Cherry(), 1079, 500 - height2);
               incrementTotalScore(10);
        }
        if (Greenfoot.getRandomNumber(200) < 0.5) {
               addObject(new Plum(), 1079, 500 - height2);
               incrementTotalScore(10);
        }
        if (Greenfoot.getRandomNumber(400) < 0.5) { 
            addObject(new Coins(), 1079, 400 - height2);
            incrementTotalScore(30);
        }
        if (Greenfoot.getRandomNumber(600) < 0.5) {
            addObject(new Knight(), 1079, 559);
            incrementTotalScore(30);
        }
    }
    /**
     * Act - do whatever the DinoRush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (score < 0) {
            score = 0;
            Greenfoot.setWorld(new GenGameOver());
        }
        height2 = Greenfoot.getRandomNumber(300);
        addAllies();
        countTime();
        displayPercentage();
        counter++;
        if (counter == 250 + random) {
            makeTiles();
            counter = 0;
            random = Greenfoot.getRandomNumber(150);
        }
    }
}
