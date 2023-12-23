import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Predator1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Predator1 extends Actor
{
    /**
     * Act - do whatever the Predator1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-4, getY());
        if(isTouching(MainFish.class))
        {
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<5)
        getWorld().removeObject(this);
    }
}
