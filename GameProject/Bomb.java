import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviour for bomb objects in World.
 * 
 * @author Andrei Marinescu, Giuliana Bouzon
 */
public class Bomb extends Enemies {
    int speed;
    private int timer;
    public Bomb(){
        speed = Greenfoot.getRandomNumber(5)+1;
        timer = 0;
    }
    /**
     * Spawns bombs in Snake class.
     */
    private void spawn(){
        setLocation(getX(), getY()+speed);
        if(isTouching(Ground.class)){
            ((MyWorld)getWorld()).addScore(5);
            ((MyWorld)getWorld()).removeObject(this);
        }
        else if(isTouching(BabyDragon.class) && ((Snake)getWorld()).getTime()>0){
            ((MyWorld)getWorld()).addScore(-10);
            if(timer==2){
                setImage("bombSprite1.png");
                Greenfoot.playSound("boom.wav");
            }
            if(timer==4){
                setImage("Explosion.png");
            }
            if(timer==5){
                ((MyWorld)getWorld()).removeObject(this);
                timer = 0;
            }
            timer++;
        }
    }
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        GreenfootImage image = getImage();
        image.scale(70, 70);
        spawn();
    } 
}
