import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruits here.
 * 
 * @author 
 * @version (a version number or a date)
 */
public class Fruits extends Allies
{
    private int speed;
    /**
     * Moves fruits until the left of the screen (which is where they will disappear)
     * @author Chelsea Nadarajah-Chinniah
     */
    protected void movingFruits() {
        setLocation(getX()-speed,getY());
        if (getX() == 0) {
            MyWorld myworld = (MyWorld)getWorld();
            myworld.removeObject(this);
        }
    }
    public Fruits() {
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //generateFruits();
    }  
    /**
     * Generates a new Fruit randomly when the class Fruits is instantiated.
     * @author Giuliana Bouzon
     */
    public void generateFruits(){
        int choice = Greenfoot.getRandomNumber(8);
        switch(choice){
            case 0:
                 new Blackberry();
            case 1:
                 new Cherry();
            case 2:
                 new Lemon();
            case 3:
                 new Orange();
            case 4:
                 new Plum();
            case 5:
                 new Raspberry();
            case 6:
                 new StarFruit();
            case 7:
                 new Strawberry();
            default:
                 
        }
    }
}
