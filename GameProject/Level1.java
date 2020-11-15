import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends MyWorld
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        prepare();
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
        Cherry cherry = new Cherry();
        addObject(cherry,643,558);
        Plum plum = new Plum();
        addObject(plum,697,556);
        StarFruit starFruit = new StarFruit();
        addObject(starFruit,759,561);
        Coins coins = new Coins();
        addObject(coins,582,556);
        Coins coins2 = new Coins();
        addObject(coins2,823,557);
    }
}
