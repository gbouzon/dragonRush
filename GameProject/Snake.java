import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Entails everything in the level 2 of game.
 * 
 * @author Giuliana Bouzon
 */
public class Snake extends MyWorld
{
    private int time;
    public Snake()
    {
        time = 3500;
        showTime();
        prepare();
    }
    /**
     * Returns Snake class' time.
     */
    public int getTime(){
        return time;
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
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,541,655);
        BabyDragon dragonSnake = new BabyDragon();
        addObject(dragonSnake,186,538);
        Restart restart = new Restart();
        addObject(restart,972,686);
    }
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        countTime();
        if(time>0){
            if(Greenfoot.getRandomNumber(100)<0.5){
                addObject(new StarFruit(), Greenfoot.getRandomNumber(1080), 1);
                totalScore = totalScore + 10;
            }
            if(Greenfoot.getRandomNumber(100)<1){
                addObject(new Plum(), Greenfoot.getRandomNumber(1080), 1);
                totalScore = totalScore + 10;
            }
            if(Greenfoot.getRandomNumber(100)<0.5){
                addObject(new Cherry(), Greenfoot.getRandomNumber(1080), 1);
                totalScore = totalScore + 10;
            }
            if(Greenfoot.getRandomNumber(100)<0.1){
                addObject(new Coins(), Greenfoot.getRandomNumber(1080), 1);
                totalScore = totalScore + 30;
            }
        }
    }
}
