import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tinyEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tinyEnemy extends Enemies
{
    private Color blue;
    
    public tinyEnemy() {
        blue = Color.BLUE;
    }
    /**
     * Act - do whatever the tinyEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        enemyMoves();
    }
    /**
     * Makes the enemy move through the maze
     */
    public void enemyMoves() {
        if(!touchingWalls()) {
            move(-3);
        }
        else {
            int rnd = Greenfoot.getRandomNumber(3);
            if(rnd == 0) {
                turn(90);
            }
            else if(rnd == 1) {
                turn(-90);
            }
            else {
                turn(180);
            }
        }
    }
    /**
     * Checks if the character is touching the walls of the maze
     */
    public boolean touchingWalls() {
        World world = (Level3)getWorld();
        GreenfootImage background = world.getBackground();
        if (background.getColorAt(getX(), getY()).equals(blue)) {
            return true;
        }
        else {
            return false;
        }
    }
}
