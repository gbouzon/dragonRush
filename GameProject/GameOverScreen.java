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
        prepare();
        showSkill();
    }
    /**
     * Displays player's skill
     */
    private void showSkill(){
        showText("Skill percentage: " + calculatePercentage() + "%", 547, 432);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        Menu menu = new Menu();
        addObject(menu,594,214);
    }
}
