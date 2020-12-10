import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines fire's behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Fire extends Dragon {
    private int indexFire,counter, timer;
    private GreenfootImage[] fire;
    private char direction;
    /**
     * Constructor for Fire class.
     */
    public Fire(char direction){
        this.direction = direction;
        fire = new GreenfootImage[6];
        indexFire = 0;
        for(int i = 0; i<fire.length; i++){
            fire[i] = new GreenfootImage("fire" + (i+1) + ".png");
        }
    }
    /**
     * Overloaded constructor.
     */
    public Fire(){
        this('r');
    }
    /**
     * Animates the fire objects.
     */
    private void attack(){
        if (counter==5){
            switchImage(fire, indexFire++%6); 
            counter =0;
        }
        counter++;
    }
    /**
     * Makes the fire move according to the direction entered.
     */
    private void moveAccordingly(){
        if(this.direction == 'r'){
            move(5);
        }
        else if(this.direction == 'l'){
            move(-5);
        }
    }
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(getOneIntersectingObject(Knight.class)!=null){
            getWorld().removeObject(this);
        }
        else if(getX() == 1079 || getX() == 0){
            getWorld().removeObject(this);
        }
        else if(timer==50){
           getWorld().removeObject(this);
           timer = 0;
        }
        moveAccordingly();
        attack();
        timer++;
    }
}
