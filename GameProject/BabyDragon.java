import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BabyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyDragon extends Dragon
{
    private int counter;
    /**
     * Constructor for Baby Dragon class.
     */
    public BabyDragon(){ //to be refactored using methods
        bDragonIdle = new GreenfootImage("dragonIdle1.png");
        
        
      
        bDragonAttack = new GreenfootImage[5];
        indexBDragonAttack = 0;
        for(int i = 0; i<bDragonAttack.length; i++){
            bDragonAttack[i] = new GreenfootImage("dragonA" + (i+1) + ".png");
        }
        
        bDragonWalkLeft = new GreenfootImage[5];
        indexBDragonLeft = 0;
        for(int i = 0; i<bDragonWalkLeft.length; i++){
            bDragonWalkLeft[i] = new GreenfootImage("dragonWL" + (i+1) + ".png");
        }
       
        bDragonWalkRight = new GreenfootImage[5];
        indexBDragonRight = 0;
        for(int i = 0; i<bDragonWalkRight.length; i++){
            bDragonWalkRight[i] = new GreenfootImage("dragonWR" + (i+1) + ".png");
        }
    }
    private void switchImageRight(){
        setImage(bDragonWalkRight[indexBDragonRight % bDragonWalkRight.length]);
        indexBDragonRight++;
    }
    private void switchImageLeft(){
        setImage(bDragonWalkLeft[indexBDragonLeft % bDragonWalkLeft.length]);
        indexBDragonLeft++;
    }
    private void attack(){
        Fire fire = new Fire();
        getWorld().addObject(fire, this.getX()+150, this.getY());
        fire.growFire();
    }
    private void stop(){
        Fire fire = new Fire();
        getWorld().addObject(fire, this.getX()+150, this.getY());
        fire.shrinkFire();
    }
    
    private void userControl(){
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-5,getY());
            removeTouching(Fire.class);
            if(counter==4){
                switchImageLeft();
                counter=0;
            }
            else{
                counter++;
            }
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+5,getY());
            removeTouching(Fire.class);
            if(counter==4){
                switchImageRight();
                counter=0;
            }
            else{
                counter++;
            }
            
        }
        if(Greenfoot.isKeyDown("space")) {
            //jump
        }
        if(Greenfoot.isKeyDown("x")){
                setImage("dragonA5.png");
                attack();
        }
         /*
          *if(Greenfoot.isKeyDown("x") && getImage().equals(bDragonWalkRight)){
                setImage("dragonA5.png");
                attack();
        }
        else if(Greenfoot.isKeyDown("x") && getImage().equals(bDragonWalkLeft)){
              setImage("dragonA5L.png");
              attack();
         }
          */

        }
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //example of using the animation method. Put this in your control method.
        userControl();
        eat();
        new Fruits().generateFruits();
    }    
}
