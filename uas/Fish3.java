import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish3 extends Actor
{
    private int speed;
    public Fish3()
    {
     speed=Greenfoot.getRandomNumber(3)+1;
    }
    /**
     * Act - do whatever the Fish3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-speed,getY());
        if(getX() == 0)
        {
            Level2.score.add(0);
            Level3.score.add(-2);
            getWorld().removeObject(this);
    }
    }
}
