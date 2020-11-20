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
    /*
     * Constructor for Baby Dragon class.
     
    public BabyDragon(){ //to be refactored using methods
        dragonI = new GreenfootImage("dragonIdle1.png");
    }
    
    private void userControl(){
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-5,getY());
            if(counter==4){
                
                counter=0;
            }
            else{
                counter++;
            }
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+5,getY());
            if(counter==4){
                
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
        }
         /*
          *if(Greenfoot.isKeyDown("x") && getImage().equals(dragonR)){
                setImage("dragonA5.png");
                attack();
        }
        else if(Greenfoot.isKeyDown("x") && getImage().equals(dragonL)){
              setImage("dragonA5L.png");
              attack();
         }
          

        }
        */
    /**
     * Act - do whatever the BabyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //example of using the animation method. Put this in your control method.
        //userControl();
        //eat();
    }    
}
