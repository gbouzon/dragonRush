import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen to display game over message.
 * 
 * @author Giuliana Bouzon
 */
public class GameOverScreen extends MyWorld {
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
        showSkill();
    }
    /**
     * Checks if player has more or less than 60% and prints out their skill.
     */
    private void showSkill(){
        if(calculatePercentage()>60){
            showText("Congrats! Your performance score is: " + calculatePercentage() 
            + "%", 540, 380);
        }
        else if(calculatePercentage()<60){
            showText("Maybe practice some more..your performance score is: " + calculatePercentage()
             + "%", 540, 380);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Menu menu = new Menu();
        addObject(menu,594,214);
    }
}
