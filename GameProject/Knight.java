import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Defines Knight's behaviour.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends Enemies
{
    private Color white;
    public Knight(){
        white = Color.WHITE;
    }
    /**
     * Makes the enemy move through the maze
     */
    public void enemyMoves() {
        if(!touchingWalls() && !isAtEdge()) {
            move(-3);
        }
        else {
            int rnd = Greenfoot.getRandomNumber(3);
            if(rnd == 0) {
                turn(90);
                move(-3);
            }
            else if(rnd == 1) {
                turn(180);
                move(-3);
            }
            else {
                turn(30);
                move(-3);
            }
        }
    }
    /**
     * Checks if the character is touching the walls of the maze
     */
    public boolean touchingWalls() {
        World world = (PacMan)getWorld();
        GreenfootImage background = world.getBackground();
        if (background.getColorAt(getX(), getY()).equals(white)) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Act - do whatever the kNIGHT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        enemyMoves();
    } 
}
