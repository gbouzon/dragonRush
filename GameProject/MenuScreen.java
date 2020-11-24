import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 725, 1); 
    }
    /**
     * Act - do whatever the MenuScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        startGame();
    }
    /**
     * Starts game
     */
    private void startGame(){
        if(Greenfoot.getKey()!=null){
            addObject(new TransitionScreen(),540,363);
            //Greenfoot.start();
        }
    }
}
