import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGame extends Actor
{ GreenfootImage image1 = new GreenfootImage("PlayGame.png");  
    /**
     * Act - do whatever the PlayGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  image1.scale(10,10);
        if(getX() >=884){
        move(-5);
        //setImage(image1);
    }
        if(Greenfoot.mouseClicked(this)){
            
            Greenfoot.setWorld(new Myworld());
        // Add your action code here.
    }    
}
}
