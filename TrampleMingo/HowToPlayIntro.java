import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlayIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlayIntro extends World
{ int temp = 0;
    int ran;

    /**
     * Constructor for objects of class HowToPlayIntro.
     * 
     */
    public HowToPlayIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 640, 1);
        addObject(new HomeButton() , 1125, 76);

        
    }
    public void monsterSpawn(){
        if(temp % 6 == 0){
               ran = Greenfoot.getRandomNumber(50);
               
               if(ran % 4 == 0){
                     int mon = Greenfoot.getRandomNumber(50);
                   if(mon % 21 == 3){
                       addObject(new Monster(), 1088, 570);
                    }if(mon %19==1){
                       addObject(new Monster2(), 1088, 570);
                     
                    }
                
               }
            }
            temp++;
    }
    public void act(){
        monsterSpawn();
        
    }
}
