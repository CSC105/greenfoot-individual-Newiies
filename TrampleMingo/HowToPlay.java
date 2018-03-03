import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends Actor
{
       GreenfootImage image1 = new GreenfootImage("HowToPlay1.png");  
    /**
     * Act - do whatever the PlayGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  image1.scale(10,10);
        if(getX() >=868){
        move(-5);
    }
        if(Greenfoot.mouseClicked(this)){
            
            Greenfoot.setWorld(new HowToPlayIntro());
            
        // Add your action code here.
    }    
}
}
