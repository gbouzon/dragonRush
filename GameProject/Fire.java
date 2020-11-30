import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Dragon
{
    private int indexFire,counter;
    private GreenfootImage[] fire;
    
    public Fire(){
        fire = new GreenfootImage[6];
        indexFire = 0;
        for(int i = 0; i<fire.length; i++){
            fire[i] = new GreenfootImage("fire" + (i+1) + ".png");
        }
    }
    private void attack(){
        if (counter==5){
            switchImage(fire, indexFire++%6); 
            counter =0;
        }
        counter++;
    }
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        attack();
    }
}
