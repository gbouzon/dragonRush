import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen to display game instructions.
 * 
 * @author Giuliana Bouzon
 */
public class InstructionScreen extends World {
    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 725, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Menu menu = new Menu();
        addObject(menu, 540, 673);
    }
}
