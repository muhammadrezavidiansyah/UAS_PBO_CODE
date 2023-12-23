import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPage extends World
{

    /**
     * Constructor for objects of class OverPage.
     * 
     */
    public OverPage()
    {    
        super(950,550,1);
        prepare();
    }
    
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,368,376);
        Replay replay = new Replay();
        addObject(replay,622,373);
        showText("Predator memakanmu, kamu kalah!!!",475,280);
        showText("SCORE : "+MyWorld.score.getValue()+" points", 475,305);
        Greenfoot.playSound("gameOver.wav");
    }
}
