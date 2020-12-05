import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Enemies
{
    int speed;
    private int timer=0;
    
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomb(){
        speed = Greenfoot.getRandomNumber(5)+1;
    }
     
    public void act() 
    {
        GreenfootImage image=getImage();
        image.scale(70, 70);
        spawn();
        
    } 
    public void spawn(){
        if(getWorld().getClass() == Snake.class){
            setLocation(getX(), getY()+speed);
            if(isTouching (Ground.class)){
                ((MyWorld)getWorld()).addScore(-5);
                ((MyWorld)getWorld()).removeObject(this);
            }
            else if(isTouching (BabyDragon.class)){
                ((MyWorld)getWorld()).addScore(-10);
                timer++;
                if(timer==2){
                    setImage("bombSprite1.png");
                }
                if(timer==4){
                    setImage("Explosion.png");
                }
                if(timer==5){
                    ((MyWorld)getWorld()).removeObject(this);
                }
          }
    }
   }
   
}
