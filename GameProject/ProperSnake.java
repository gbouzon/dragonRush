import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ProperSnake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProperSnake extends MyWorld
{
    public int timer;
    public int counter;
    public int speed;
    /**
     * Constructor for objects of class ProperSnake.
     * 
     */
    public ProperSnake()
    {
       counter=0;
       timer = 3000;
       showTime();
       prepare();
       lines();
       
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        if (timer>=0){
        int y= Greenfoot.getRandomNumber(getHeight());
        int x= Greenfoot.getRandomNumber(getWidth());
        addObject(new DBDragon(), x, y);
       }
        Restart();
        line line1 = new line();
        addObject(line1, 500,740);
        line line2= new line();
        addObject(line2,120,740);
        line line3= new line();
        addObject(line3,700,740);
        line line4= new line();
        addObject(line4,950,740);
        line line5= new line();
        addObject(line5,210,740);
        
    }
    
    public void act() {
          countTime();
          if(timer>0){
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
          if(Greenfoot.getRandomNumber(100)<0.1){
                addObject(new Bomb(), Greenfoot.getRandomNumber(1080), 1);
                totalScore = totalScore - 30;
          }
         }
    }
    private void Restart(){
        Restart restart = new Restart();
        addObject(restart,972,686);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void lines()
    {
        GreenfootImage lines= new GreenfootImage(5,5);
        lines.setColor(Color.BLACK);
        lines.drawRect(0,0,5,5);
    }
    /**
     * Count down the game time and display it. Stop the game with a winning message when time is up.  
     */
    public void countTime() {
        timer --;
        showTime();
        if(timer == -100) {
            addObject(new TransitionScreen(),540,363);
        }
    }
    /**
     * Show the remaining game time on screen.
     */
    public void showTime() {
        if(timer>=0){
            showText("Time: " + timer,1000,25);
        }
    }
}
