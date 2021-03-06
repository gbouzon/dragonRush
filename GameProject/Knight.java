import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines the knight objects' behaviour.
 * 
 * @author Giuliana Bouzon, Chelsea Nadarajah-Chinniah
 */
public class Knight extends Enemies {
    private Color white;
    private int x;
    /**
     * Constructor for Knight class.
     */
    public Knight() {
        white = Color.WHITE;
        x = Greenfoot.getRandomNumber(1079);
    }
    /**
     * Makes the enemy move through the maze (Pac-Man).
     */
    private void enemyMoves() {
        if (!touchingWalls() && !isAtEdge()) {
            move(-3);
        }
        else {
            int rnd = Greenfoot.getRandomNumber(3);
            if (rnd == 0) {
                turn(90);
                move(-3);
            }
            else if (rnd == 1) {
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
    private boolean touchingWalls() {
        World world = (PacMan) getWorld();
        GreenfootImage background = world.getBackground();
        if (background.getColorAt(getX(), getY()).equals(white)) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Makes the enemy move in DinoRush
     */
    private void moveDino() {
        turnTowards(BabyDragon.getDragonX(), getY());
        if (getX() == BabyDragon.getDragonX()) {
            setLocation(getX(), getY());
        }
        else if (getX() > BabyDragon.getDragonX()) {
            setImage("knightWL1.png");
            setLocation(getX() - 1, getY());
        }
        
        else if (getX() < BabyDragon.getDragonX()) {
            setImage("knightWR1.png");
            setLocation(getX() + 1, getY());
        }
    }
    /**
     * Detects World to act accordingly.
     */
    private void detectClass() {
        if (getWorld().getClass() == DinoRush.class) {
            moveDino();
            if (isTouching(Fire.class)) {
                ((MyWorld) getWorld()).addScore(30);
                getWorld().removeObject(this);
            }
        }
        else if (getWorld().getClass() == PacMan.class) {
            enemyMoves();
        }
    }
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        detectClass();
    } 
}
