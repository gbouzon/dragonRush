import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviour of GenGameOver class.
 * 
 * @author Giuliana Bouzon
 */
public class GenGameOver extends MyWorld {
    /**
     * Constructor for objects of class GenGameOver.
     * 
     */
    public GenGameOver(){    
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        Menu menu = new Menu();
        addObject(menu,523,518);
    }
}
