import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviours and characteristics of the BabyDragon.
 * @author Giuliana Bouzon
 */
public class BabyDragon extends Dragon
{
    private Color white;
    private int counter, speed;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -8;
    private char direction;
    private boolean isDownR, isDownL;
    /**
     * Constructor for Baby Dragon class.
     */
    public BabyDragon(){ //to be refactored using methods
        //dragonI = new GreenfootImage("dragonIdle1.png");
        white = Color.WHITE;
        isDownR = false;
        isDownL = false;
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
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2-20, Ground.class);
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
        if(getY()>536){
            setLocation(getX(), 536);
        }
    }
    /**
     * userControl() method overridden from superclass and implemented to move character.
     */
    private void userControl(){
        Fire fire = new Fire();
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-speed,getY());
            direction = 'l';
            if(counter==(12-speed)){
                switchImage(dragonL, indexDragonL++&dragonL.length);
                counter=0;
            }
            else{
                counter++;
            }
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+speed,getY());
            direction = 'r';
            if(counter==(12-speed)){
                switchImage(dragonR, indexDragonR++&dragonR.length); 
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
        if(Greenfoot.isKeyDown("x") && direction=='r'){
            setImage("dragonA5.png");
            if(!isDownR){
                getWorld().addObject(fire, this.getX()+85, this.getY());
                isDownR = true;
            }
            else if(isDownR){
                //fire.attack();
            }
        }

        else if(Greenfoot.isKeyDown("x") && direction=='l'){
            setImage("dragonA5L.png");
            if(!isDownL){
                getWorld().addObject(fire, this.getX()+85, this.getY());
                isDownL = true;
            }
            else if(isDownL){
                //fire.attack();
            }
        }
        //getWorld().removeObject(fire);
    }
    private GreenfootImage[] scaleImage(GreenfootImage[] array){
        for(int i = 0; i<array.length; i++){
            GreenfootImage image = array[i];
            ((PacMan)getWorld()).scaleImage(image);
            
        }
        return array;
    }
    /**
     * Allows the user to control the game using the keys (w,a,s,d and right,left,up,down)
     */
    private void userControlP() {
        
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
            if(counter==4){
                //scaleImage(dragonR); can't put this here cuz called in the act()
                //switchImage(dragonR, indexDragonR++&dragonR.length); --fix scaling
                counter=0;
            }
            else{
                counter++;
            }
            if(touchingWalls() && !isAtEdge()) {
                setLocation(getX() - 20, getY());
                Greenfoot.playSound("8BitHurt.wav");
            }
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
            if(counter==4){
                //switchImage(dragonL, indexDragonL++&dragonL.length); --fix scaling
                counter=0;
            }
            else{
                counter++;
            }
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
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectClass();
    }    
}
