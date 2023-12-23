import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish1 extends Actor
{
    private int speed;
    public Fish1()
    {
        speed=Greenfoot.getRandomNumber(4)+1;
    }
    /**
     * Act - do whatever the Fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-speed,getY());
        if(getX() == 0)
        {
            MyWorld.score.add(0);
            Level2.score.add(-1);
            Level3.score.add(-2);
            getWorld().removeObject(this);
        }
    }
}
