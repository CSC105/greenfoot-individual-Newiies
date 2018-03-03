import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{  GreenfootSound myMusic = new GreenfootSound(("The DERP song.mp3"));

    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 640, 1);
        addObject(new PlayGame(), 1200 , 251);
        addObject(new MonsterIntro(), 330 , 290);
       addObject(new HowToPlay(), 1200,343);
       
       
}
public void act(){
    
    Sound();


    //Greenfoot.playSound("The DERP song.mp3");
}
public void Sound(){
     myMusic.playLoop();
     if(Greenfoot.mouseClicked(null)){
    myMusic.pause();
}
} 

}