import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruits extends Allies
{
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        generateFruits();
    }  
    /**
     * Generates a new Fruit randomly when the class Fruits is instantiated.
     * @author Giuliana Bouzon
     */
    public Actor generateFruits(){
        int choice = Greenfoot.getRandomNumber(8);
        switch(choice){
            case 0:
                return new Blackberry();
            case 1:
                return new Cherry();
            case 2:
                return new Lemon();
            case 3:
                return new Orange();
            case 4:
                return new Plum();
            case 5:
                return new Raspberry();
            case 6:
                return new StarFruit();
            case 7:
                return new Strawberry();
            default:
                return null;
        }
    }
}
