import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinoRush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinoRush extends MyWorld
{
    private int time,counter, height, height2, random;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public DinoRush()
    {
        
        counter=0;
        time = 3500;
        showTime();
        prepare();
        setPaintOrder(Border.class,BabyDragon.class, Coins.class, Fruits.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Border border = new Border();
        addObject(border,1254,358);
        Border border2 = new Border();
        addObject(border2,22,359);
        BabyDragon babyDragon = new BabyDragon();
        addObject(babyDragon,226,536);
        Ground ground = new Ground();
        addObject(ground,541,654);
        
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
    public void makeTiles(){
        height = Greenfoot.getRandomNumber(400);
        for(int i = 0; i<4; i++){
            addObject(new Block(), i*49 +1000, 482-height);
        }
    }
    public void addAllies(){
        if(Greenfoot.getRandomNumber(200)<0.5){
               addObject(new StarFruit(), 1079, 500-height2);
        }
        if(Greenfoot.getRandomNumber(200)<0.5){
               addObject(new Cherry(), 1079, 500-height2);
        }
        if(Greenfoot.getRandomNumber(200)<0.5){
               addObject(new Plum(), 1079, 500-height2);
        }
        if(Greenfoot.getRandomNumber(400)<0.5){
            addObject(new Coins(), 1079, 400-height2);
        }
    }
    /**
     * Act - do whatever the DinoRush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(time<0){
            showText("Game Over", 400, 350); //still have to add gameover/restart screen.
            Greenfoot.stop();
        }
        height2 = Greenfoot.getRandomNumber(300);
        addAllies();
        countTime();
        counter++;
        if(counter==250+random){
            makeTiles();
            counter=0;
            random = Greenfoot.getRandomNumber(150);
        }
    }
}
