import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp :  ");
    
    public MyWorld()
    {
        super(950,550,1);
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(90) < 3){
            addObject(new Fish1(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 3){
            addObject(new Fish2(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(200) < 3){
            addObject(new Predator1(), 948, Greenfoot.getRandomNumber(360));
        }
        if(MyWorld.score.getValue()>=50)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new Level2());
        }
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void prepare()
    {    
        MainFish mainFish = new MainFish();
        addObject(mainFish,39,259);
        Fish1 fish1 = new Fish1();
        addObject(fish1,702,44);
        Fish1 fish12 = new Fish1();
        addObject(fish12,852,483);
        Fish1 fish13 = new Fish1();
        addObject(fish13,459,429);
        Fish1 fish14 = new Fish1();
        addObject(fish14,469,127);
        Fish1 fish15 = new Fish1();
        addObject(fish15,856,207);
        Fish2 fish2 = new Fish2();
        addObject(fish2,855,90);
        Fish2 fish22 = new Fish2();
        addObject(fish2,855,90);
        Fish2 fish23 = new Fish2();
        addObject(fish2,457,332);
        Predator1 predator1 = new Predator1();
        addObject(predator1,506,22);
        Predator1 predator12 = new Predator1();
        addObject(predator12,532,518);
        
        addObject(score,80,45);
        score.setValue(0);
        addObject(hp,870,45);
        hp.setValue(1);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
