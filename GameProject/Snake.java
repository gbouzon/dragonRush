import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends MyWorld
{
    ScoringSystem num=new Score();
    
    
    int amount=0;
    public Score dragonScore=new Score();
    public Snake()
    {
        /* So the world is 35 by 35 and the size of each individual squares will be 25 by 25.
         * DrawRect to color the outlines.
         * Purpose of these squares is to make boundaries where the dragon can move.
         */
        
        GreenfootImage lines= new GreenfootImage(25,25);
        lines.setColor(Color.BLACK);
        lines.drawRect(0,0,25,25);
        

        
        /*
         * Randomly generated initial spots for the dragon
         */
        Dragon now=new Dragond();
        int y= Greenfoot.getRandomNumber(getHeight());
        int x= Greenfoot.getRandomNumber(getWidth());
        addObject(new Dragond(), x, y);
        addObject(num,28,30);
        addKnight();
        
    }
    public void addKnight()
    {
        Enemies kill=new Knight();
       int y=Greenfoot.getRandomNumber(30);
       int x=Greenfoot.getRandomNumber(30);
       addObject(new Knight(), x+1, y+1);
    }
}
