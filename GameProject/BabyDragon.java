import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviours and characteristics of the BabyDragon.
 * 
 * @author Giuliana Bouzon
 * @version Version 3.0
 */
public class BabyDragon extends Dragon
{
    private GreenfootImage dragonI;
    
    private int counter;
    
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -8;
    /**
     * Constructor for Baby Dragon class.
     */
    public BabyDragon(){ //to be refactored using methods
        dragonI = new GreenfootImage("dragonIdle1.png");
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
    public void userControl(){
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-2,getY());
            if(counter==4){
                //switchImage();
                counter=0;
            }
            else{
                counter++;
            }
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+2,getY());
            if(counter==4){
                //switchImage();
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
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //example of using the animation method. Put this in your control method.
        userControl();
        checkFalling();
        eat();
    }    
}
