import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransitionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitionScreen extends Actor
{
    private int counter;
    public TransitionScreen(){
        counter=0;
    }
    /**
     * Act - do whatever the TransitionScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectWorld();
    }   
    /**
     * Detects world
     */
    public void detectWorld(){
        //getWorld().addObject(new Play(), 527, 509);
        if(getWorld().getClass()==PacMan.class){
            setImage("transition2.png");
            if(counter==500){
                Greenfoot.setWorld(new ProperSnake());
                counter=0;
            }
            else{
                counter++;
            }
        }
        else if (getWorld().getClass()==ProperSnake.class){
            setImage("transition3.png");
            if(counter==500){
                Greenfoot.setWorld(new DinoRush());
                counter=0;
            }
            else{
                counter++;
            }
        }
        else if (getWorld().getClass()==DinoRush.class){
            //Greenfoot.setWorld(new GameOverScreen());
            //player chooses to play again or to end
            //Greenfoot.setWorld(new MenuScreen());
        }
        else{
            setImage("transition1.png");
            
            if(counter==500){
                Greenfoot.setWorld(new PacMan());
                counter=0;
            }
            else{
                counter++;
            }
        }
    }
}
