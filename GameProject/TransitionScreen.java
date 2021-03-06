import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen to display instructions of each level.
 * 
 * @author Giuliana Bouzon
 */
public class TransitionScreen extends Actor {
    private int counter;
    public TransitionScreen() {
        counter = 0;
    }
    /**
     * Detects world to generate according transition screen.
     */
    private void detectWorld() {
        if (getWorld().getClass() == PacMan.class) {
            setImage("transition2.png");
            if (Greenfoot.getKey() != null && counter > 50) {
                Greenfoot.setWorld(new Snake());
                counter = 0;
            }
            else {
                counter++;
            }
        }
        else if (getWorld().getClass() == Snake.class) {
            setImage("transition3.png");
            if (Greenfoot.getKey() != null && counter > 50) {
                Greenfoot.setWorld(new DinoRush());
                counter = 0;
            }
            else {
                counter++;
            }
        }
        else {
            setImage("transition1.png");
            if (Greenfoot.getKey() != null && counter > 50) {
                Greenfoot.setWorld(new PacMan());
                counter = 0;
            }
            else {
                counter++;
            }
        }
    }
    /**
     * Act - do whatever the TransitionScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        detectWorld();
    }  
}
