import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Play play = new Play();
        addObject(play,475,397);
        Help help = new Help();
        addObject(help,72,484);
        Greenfoot.playSound("waterAmb1.wav");

        Play play2 = new Play();
        addObject(play2,505,281);
        play.setLocation(492,394);
        play.setLocation(524,410);
        play.setLocation(511,407);
        play.setLocation(510,406);
        play.setLocation(556,382);
        play2.setLocation(528,286);
        play.setLocation(546,362);
        removeObject(play);
        play2.setLocation(523,268);
        play2.setLocation(520,294);
        play2.setLocation(461,272);
        Play play3 = new Play();
        addObject(play3,461,272);
        play2.setLocation(558,358);
        play2.setLocation(538,352);
        removeObject(play2);
        play3.setLocation(518,308);
        play3.setLocation(438,301);
        Play play4 = new Play();
        addObject(play4,438,301);
        play3.setLocation(547,310);
        play3.setLocation(604,416);
        play3.setLocation(590,418);
        removeObject(play3);
        play4.setLocation(439,294);
        play4.setLocation(471,276);
        Play play5 = new Play();
        addObject(play5,471,276);
        play4.setLocation(477,382);
        removeObject(play4);
        play5.setLocation(470,278);
        play5.setLocation(538,308);
        Play play6 = new Play();
        addObject(play6,538,308);
        play5.setLocation(344,307);
        removeObject(play5);
        play6.setLocation(483,280);
    }
}
