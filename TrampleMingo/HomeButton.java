import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeButton extends Actor
{ GreenfootImage image1 = new GreenfootImage("HomeButton.png");
    /**
     * Act - do whatever the HomeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { image1.scale(80,80);
        setImage(image1);
         if(Greenfoot.mouseClicked(this)){
            
            Greenfoot.setWorld(new Intro());
            
       
    }  
        // Add your action code here.
    }    
}
