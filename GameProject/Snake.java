import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends MyWorld
{
    int amount=0;
    private int time;
    public Snake()
    {
        /* So the world is 35 by 35 and the size of each individual squares will be 25 by 25.
         * DrawRect to color the outlines.
         * Purpose of these squares is to make boundaries where the dragon can move.
         */
        time = 3500;
        showTime();
        //reenfootImage lines= new GreenfootImage(25,25);
        //lines.setColor(Color.BLACK);
        //lines.drawRect(0,0,25,25);

        /*
         * Randomly generated initial spots for the dragon
         */
        //Dragon now=new Dragond();
        //int y= Greenfoot.getRandomNumber(getHeight());
        //int x= Greenfoot.getRandomNumber(getWidth());
        //addObject(new Dragond(), x, y);
        //addObject(num,28,30);
        //addKnight();

        prepare();
    }

    public void act() {
        countTime();
        if(time>0){
            if(Greenfoot.getRandomNumber(100)<0.5){
                addObject(new StarFruit(), Greenfoot.getRandomNumber(1080), 1);
            }
            if(Greenfoot.getRandomNumber(100)<1){
                addObject(new Plum(), Greenfoot.getRandomNumber(1080), 1);
            }
            if(Greenfoot.getRandomNumber(100)<0.5){
                addObject(new Cherry(), Greenfoot.getRandomNumber(1080), 1);
            }
            if(Greenfoot.getRandomNumber(100)<0.1){
                addObject(new Coins(), Greenfoot.getRandomNumber(1080), 1);
            }
        }
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
    }
}
