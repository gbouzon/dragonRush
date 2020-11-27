import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviours and characteristics of the BabyDragon.
 * 
 * @author Giuliana Bouzon
 * @version Version 3.0
 */
public class BabyDragon extends Dragon
{
    //private GreenfootImage dragonI;
    private Color white;
    private int counter, speed;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -8;
    /**
     * Constructor for Baby Dragon class.
     */
    public BabyDragon(){ //to be refactored using methods
        //dragonI = new GreenfootImage("dragonIdle1.png");
        white = Color.WHITE;
    }
    /**
     * Adds basic physics concepts (gravity) so the character falls.
     */
    private void fall(){
        setLocation(getX(), getY()+vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    /**
     * Checks if the character is on the ground and returns true when that is the case.
     */
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under !=null;
    }
    /**
     * Checks if the character is on the blocks and returns true when that is the case.
     */
    private boolean onBlock(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Block.class);
        return under!=null;
    }
    /**
     * Makes the character fall when it isn't on the ground or on a block (so that
     * when it jumps, it falls back down).
     */
    private void checkFalling(){
        if(onGround()==false && onBlock()==false){
            fall();
        }
    }
    /**
     * userControl() method overridden from superclass and implemented to move character.
     */
    private void userControl(){
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-speed,getY());
            if(counter==4){
                switchImage(dragonL, indexDragonL);
                counter=0;
            }
            else{
                counter++;
            }
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+speed,getY());
            if(counter==4){
                //for some reason the animation doesnt work. 
                //switchImage() method is implemented in Dragon class.
                switchImage(dragonR, indexDragonR); 
                counter=0;
            }
            else{
                counter++;
            } 
        }
        if(Greenfoot.isKeyDown("space")) {
            vSpeed = jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("x") && getImage().equals(dragonR)){
                setImage("dragonA5.png");
                //attack(); --yet to be implemented
        }
        else if(Greenfoot.isKeyDown("x") && getImage().equals(dragonL)){
              setImage("dragonA5L.png");
              //attack(); --yet to be implemented
        }
    }
     /**
     * Allows the user to control the game using the keys (w,a,s,d and right,left,up,down)
     */
    private void userControlP() {
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
            if(touchingWalls() && !isAtEdge()) {
                setLocation(getX() - 20, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
            if(touchingWalls() && !isAtEdge()) {
                setLocation(getX() + 20, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
            if(touchingWalls() && !isAtEdge()) {
                setLocation(getX(), getY() + 20);
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
            if(touchingWalls() && !isAtEdge()) {
                setLocation(getX(), getY() - 20);
                Greenfoot.playSound("8BitHurt.wav");
            }
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
     * Detects the World the dragon is in to behave accordingly.
     */
    private void detectClass(){
        if(getWorld().getClass() == Snake.class){
            speed = 5;
            userControl();
            eat();
            checkFalling();
        }
        else if(getWorld().getClass() == DinoRush.class){
            speed = 2;
            userControl();
            checkFalling();
            eat();
        }
        else if(getWorld().getClass() == PacMan.class){
            userControlP();
            eat();
        }
    }
    private void attack(){
        //yet to be implemented
    }
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectClass();
    }    
}
