import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Allies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Allies extends Actor
{
    /**
     * Act - do whatever the Allies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        generateAllies();
    } 
    /**
     * Generates a random ally when Allies class is instantianted.
     * @author Giuliana Bouzon
     */
    public Actor generateAllies(){
        int choice = Greenfoot.getRandomNumber(2);
        if(choice == 0){
            return new Coins();
        }
        else{
            return new Fruits();
        }
    }
}
