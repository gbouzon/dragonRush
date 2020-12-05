import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines Instruction button's behaviour.
 * 
 * @author Giuliana Bouzon
 */
public class Instructions extends Buttons {
    private String name = "instructions";
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        mouseAnimation(name);
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new InstructionScreen());
        }
    }    
}
