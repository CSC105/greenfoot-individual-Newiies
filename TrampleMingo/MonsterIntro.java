import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonsterIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonsterIntro extends Actor
{ GreenfootImage image1 = new GreenfootImage("Flamingo1.png");
    
    /**
     * Act - do whatever the MonsterIntro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {image1.scale(300,500);
    setImage(image1);
        // Add your action code here.
        moveAround();
    }    
    public void moveAround(){
        move(5);
        turn(40);
        //Greenfoot.getRandomNumber(20)
}
}
