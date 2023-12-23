import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish2 extends Actor
{
    private int speed;
    public Fish2()
    {
        speed=Greenfoot.getRandomNumber(3)+1;
    }
    /**
     * Act - do whatever the Fish2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-speed,getY());
        if (getX() == 0)
        {
            MyWorld.score.add(0);
            Level2.score.add(-2);
            Level3.score.add(-3);
            getWorld().removeObject(this);
        }
    }
}
