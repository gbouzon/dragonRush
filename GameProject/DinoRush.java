import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinoRush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinoRush extends MyWorld
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public DinoRush()
    {
        prepare();
        setPaintOrder(Border.class,BabyDragon.class, Coins.class, Fruits.class);
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
        Ground ground = new Ground();
        addObject(ground,640,361);
        ground.setLocation(639,359);

        ground.setLocation(465,437);
        Block block = new Block();
        addObject(block,465,437);
        ground.setLocation(518,436);
        ground.setLocation(518,436);
        Block block2 = new Block();
        addObject(block2,518,436);
        ground.setLocation(524,435);
        ground.setLocation(569,437);
        ground.setLocation(569,437);
        Block block3 = new Block();
        addObject(block3,569,437);
        ground.setLocation(746,482);
        Block block4 = new Block();
        addObject(block4,746,482);
        ground.setLocation(799,481);
        ground.setLocation(799,481);
        Block block5 = new Block();
        addObject(block5,799,481);
        ground.setLocation(808,481);
    }
}
