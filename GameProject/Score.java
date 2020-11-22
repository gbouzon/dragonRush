import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends ScoringSystem
{
    int Score=0;
    public Score()
    {
       setImage(new GreenfootImage("Score: "+Score, 30, new Color(235,115,23), Color.BLACK));
       //Original of what we want
    }
    public void act() 
    {
        // Add the score int to have an updated scoreboard when you play the game.
        setImage(new GreenfootImage("Score: "+Score, 30, new Color(235,115,23), Color.BLACK));
        addScore();
    }    
    public void addScore()
    {
        Score=Score+10;
    
    }
}
