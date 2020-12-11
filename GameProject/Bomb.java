import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines behaviour for bomb objects in World.
 * 
 * @author Andrei Marinescu, Giuliana Bouzon
 */
public class Bomb extends Enemies {
    private int speed, timer;
    private GreenfootSound bomb;
    /**
     * Constructor for Bomb class.
     */
    public Bomb(){
        speed = Greenfoot.getRandomNumber(3)+1;
        timer = 0;
        bomb = new GreenfootSound("boom.wav");
    }
    /**
     * Checks if bomb overlaps with fruits or coins before adding it to the World.
     */
    private void preventOverlap(){
        if((isTouching(Fruits.class) || isTouching(Coins.class))){
            setLocation(getX()+1,getY());
        }
    }
    /**
     * Spawns bombs in Snake class.
     */
    private void spawn(){
        preventOverlap();
        setLocation(getX(), getY()+speed);
        if(isTouching(Ground.class)){
            ((MyWorld)getWorld()).addScore(30);
            ((MyWorld)getWorld()).removeObject(this);
        }
        else if(getOneIntersectingObject(BabyDragon.class)!=null && ((Snake)getWorld()).getTime()>0){
            ((MyWorld)getWorld()).addScore(-20);
            if(timer==2){
                setImage("bombSprite1.png");
                bomb.play();
            }
            if(timer==4){
                setImage("Explosion.png");
            }
            if(timer==5){
                getWorld().addObject(new Record(), getX()+20, getY());
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
