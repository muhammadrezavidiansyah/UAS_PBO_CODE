import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPage extends World
{

    /**
     * Constructor for objects of class WinPage.
     * 
     */
    public WinPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(978, 550, 1);  
        prepare();
    }
    
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,489,341);
        Greenfoot.playSound("stageClear.wav");
    }
}
