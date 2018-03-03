import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgain extends Actor
{ GreenfootImage image1 = new GreenfootImage("TryAgain.png");  
    /**
     * Act - do whatever the TryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { image1.scale(80,80);
        setImage(image1);
        if(Greenfoot.mouseClicked(this)){
            Myworld.score=0;
             Myworld.life=30;
            Greenfoot.setWorld(new Myworld());
        }
        // Add your action code here.
    }    
}
