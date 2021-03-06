import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviours and characteristics of the BabyDragon.
 * @author Giuliana Bouzon
 */
public class BabyDragon extends Dragon {
    private GreenfootImage[] dragonL, dragonR;
    private int indexDragonL, indexDragonR;
    private Color white;
    private int counter, speed;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -8;
    private char direction;
    private GreenfootSound jump, fire;
    private static int x;
    public BabyDragon() { 
        white = Color.WHITE;
        jump = new GreenfootSound("jump.wav");
        fire = new GreenfootSound("fire.wav");
        
        dragonL = new GreenfootImage[5];
        indexDragonL = 0;
        for (int i = 0; i < dragonL.length; i++) {
            dragonL[i] = new GreenfootImage("dragonWL" + (i + 1) + ".png");
        }
        
        dragonR = new GreenfootImage[5];
        indexDragonR = 0;
        for (int i = 0; i < dragonR.length; i++) {
            dragonR[i] = new GreenfootImage("dragonWR" + (i + 1) + ".png");
        }
    }
    /**
     * Returns current dragon object's x-coordinate
     */
    public static int getDragonX() {
        return x;
    }
    /**
     * Adds basic physics concepts (gravity) so that the character falls.
     */
    private void fall() {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    /**
     * Checks if the character is on the ground and returns true when that 
     * is the case.
     */
    private boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2 - 20, Ground.class);
        return under != null;
    }
    /**
     * Checks if the character is on the blocks and returns true when that 
     * is the case.
     */
    private boolean onBlock() {
        //figure out a way to normalize it like with the ground if time allows.
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Block.class);
        return under != null;
    }
    /**
     * Makes the character fall when it isn't on the ground or on a block 
     * (so that when it jumps, it falls back down). 
     */
    private void checkFalling() {
        if (onGround() == false && onBlock() == false) {
            fall();
        }
        if (getY() > 536) {
            setLocation(getX(), 536);
        }
    }
    /**
     * Allows the dragon to leave through one side and appear in the other.
     */
    private void wrapping() {
       if (getX() == 1079 && Greenfoot.isKeyDown("d")) {
           setLocation(0, getY());
       }
       if (getX() == 0 && Greenfoot.isKeyDown("a")) {
           setLocation(1079, getY());
       }
    }
    /**
     * userControl() method overridden from superclass and implemented to 
     * move character.
     */
    private void userControl() {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
            direction = 'l';
            if (counter == (12 - speed)) { 
                switchImage(dragonL, indexDragonL++ & dragonL.length);
                counter = 0;
            }
            else {
                counter++;
            }
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
            direction = 'r';
            if (counter == (12 - speed)) {
                switchImage(dragonR, indexDragonR++ & dragonR.length); 
                counter = 0;
            }
            else {
                counter++;
            } 
        }
        if (Greenfoot.isKeyDown("space")) {
            jump.play();
            vSpeed = jumpHeight;
            fall();
        }
        if (Greenfoot.isKeyDown("x") && direction == 'r') {
            fire.play();
            setImage("dragonA5.png");
            getWorld().addObject(new Fire(), this.getX() + 85, this.getY());
        }
        else if (Greenfoot.isKeyDown("x") && direction == 'l') {
            fire.play();
            setImage("dragonA5L.png");
            getWorld().addObject(new Fire('l'), this.getX() - 85, this.getY());
        }
    }
    /**
     * Allows the user to control the game using the keys (w,a,s,d and right,left,up,down)
     */
    private void userControlP() {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
            if (touchingWalls() && !isAtEdge()) {
                setLocation(getX() - 20, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
            if (touchingWalls() && !isAtEdge()) {
                setLocation(getX() + 20, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
            if (touchingWalls() && !isAtEdge()) {
                setLocation(getX(), getY() + 30);
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
            if (touchingWalls() && !isAtEdge()) {
                setLocation(getX(), getY() - 30);
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
    }
    /**
     * Checks if the character is touching the walls of the maze.
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
     * Detects the World the dragon is in to behave accordingly.
     */
    private void detectClass() {
        if (getWorld().getClass() == Snake.class) { 
            speed = 5;
            userControl();
            eat();
            checkFalling();
            wrapping();
        }
        else if (getWorld().getClass() == DinoRush.class) {
            jumpHeight = -6;
            speed = 2;
            userControl();
            checkFalling();
            eat();
            wrapping();
        }
        else if (getWorld().getClass() == PacMan.class) {
            userControlP();
            eat();
        }
    }
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        detectClass();
        x = getX();
    }    
}
