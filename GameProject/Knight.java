import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Defines the knight objects' behaviour.
 * 
 * @author Giuliana Bouzon, Chelsea Nadarajah-Chinniah
 */
public class Knight extends Enemies {
    private Color white;
    private int x;
    private GreenfootImage WR1, WR2, WR3, WL1, WL2, WL3;
    public Knight(){
        white = Color.WHITE;
        x = Greenfoot.getRandomNumber(1079);
        
        WR1 = new GreenfootImage("knightWR1.png");
        WR2 = new GreenfootImage("knightWR2.png");
        WR3 = new GreenfootImage("knightWR3.png");
        
        WL1 = new GreenfootImage("knightWR1.png");
        WL2 = new GreenfootImage("knightWR2.png");
        WL3 = new GreenfootImage("knightWR3.png");

    }
    /**
     * Animates knight's movement to the right.
     */
    private void switchImageRight(){
        if(getImage() == WR1){
            setImage(WR2);
        }
        else if(getImage() == WR2){
            setImage(WR3);
        }
        else if(getImage() == WR3){
            setImage(WR1);
        }
    }
    /**
     * Animates knight's movement to the left.
     */
    private void switchImageLeft(){
        if(getImage() == WL1){
            setImage(WL2);
        }
        else if(getImage() == WL2){
            setImage(WL3);
        }
        else if(getImage() == WL3){
            setImage(WL1);
        }
    }
    /**
     * Makes the enemy move through the maze (Pac-Man).
     */
    private void enemyMoves() {
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
     * Makes Knight move in DinoRush level.
     */
    private void moveDino(){
        if(getX()<x){
            setLocation(getX()+2, getY());
            switchImageRight();
        }
        else if(getX()>x){
            setLocation(getX()-2, getY());
            switchImageLeft();
        }
        else if(getX() == x){ 
            x = Greenfoot.getRandomNumber(1079);
        }
        else if(getX() == 1079 || getX() == 0){
            getWorld().removeObject(this);
        }
    }
    /**
     * Checks if the character is touching the walls of the maze
     */
    private boolean touchingWalls() {
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
     * Detects World to act accordingly.
     */
    private void detectClass(){
        if(getWorld().getClass() == DinoRush.class){
            moveDino();
            if(isTouching(Fire.class)){
                ((MyWorld)getWorld()).addScore(30);
                getWorld().removeObject(this);
            }
        }
        else if(getWorld().getClass() == PacMan.class){
            enemyMoves();
        }
    }
    /**
     * Act - do whatever the kNIGHT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        detectClass();
    } 
}
