import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    static Counter score = new Counter ("Score : ");
    static Counter hp = new Counter ("Hp : ");
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(160) < 3){
            addObject(new Fish1(), 948, Greenfoot.getRandomNumber(240));
        }
        if(Greenfoot.getRandomNumber(150) < 3){
            addObject(new Fish2(), 948, Greenfoot.getRandomNumber(3600));
        }
        if(Greenfoot.getRandomNumber(100) < 3){
            addObject(new Fish3(), 948, Greenfoot.getRandomNumber(400));
        }
        if(Greenfoot.getRandomNumber(500) < 1){
            addObject(new Predator1(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(450) < 2){
            addObject(new Predator2(), 948, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(600) < 2){
            addObject(new Predator3(), 948, Greenfoot.getRandomNumber(140));
        }
        if(Level3.score.getValue()>=250)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new WinPage());
        }
    }
    private void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,36,264);
        Fish1 fish1 = new Fish1();
        addObject(fish1,774,63);
        Fish1 fish12 = new Fish1();
        addObject(fish12,649,484);
        Fish2 fish2 = new Fish2();
        addObject(fish2,500,149);
        Fish2 fish22 = new Fish2();
        addObject(fish22,873,427);
        Fish3 fish3 = new Fish3();
        addObject(fish3,392,438);
        Fish3 fish32 = new Fish3();
        addObject(fish32,875,36);
        Fish3 fish33 = new Fish3();
        addObject(fish33,231,27);
        Predator1 predator1 = new Predator1();
        addObject(predator1,761,489);
        Predator2 predator2 = new Predator2();
        addObject(predator2,568,35);
        Predator3 predator3 = new Predator3();
        addObject(predator3,859,159);
        
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(hp, 870, 45);
        hp.setValue(1);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
