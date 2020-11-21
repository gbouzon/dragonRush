import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BabyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    private void fall(){
        setLocation(getX(), getY()+vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under !=null;
    }
    private boolean onBlock(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Block.class);
        return under!=null;
    }
    private void checkFalling(){
        if(onBlock()==false){
            fall();
        }
        /*
        else if(onBlock() ==false){
            fall();
        }
        */
    }
    /**
     * userControl() method overridden from superclass and implemented to move character.
     */
    public void userControl(){
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-5,getY());
            if(counter==4){
                //switchImage();
                counter=0;
            }
            else{
                counter++;
            }
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+5,getY());
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
                //attack();
        }
        else if(Greenfoot.isKeyDown("x") && getImage().equals(dragonL)){
              setImage("dragonA5L.png");
              //attack();
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
