import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{GreenfootSound myMusic = new GreenfootSound(("SadViolin.mp3"));

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 640, 1); 
        addObject(new TryAgain(), 472 , 373);
        addObject(new HomeButton(), 723 , 373);
        showText("Score: " + Myworld.score, 590 ,505);
        Sound();
        
    }
    public void Sound(){
     myMusic.playLoop();
    } public void act(){
        if(Greenfoot.mouseClicked(null)){
    myMusic.pause();
}
    }
}
 
