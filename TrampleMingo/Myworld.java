import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{ 
    GreenfootSound myMusic = new GreenfootSound(("The DERP song.mp3"));
       public static int score = 0;
       public static int life = 30;
    int temp = 0;
        int ran;
    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public Myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 670, 1);
        addObject(new Flamingos(), 100 , 515);
        
        //addObject(new Monster(),100, 522);
        //showText(_text_, _x_, _y_);

    }
    
    
    public void Sound(){
     myMusic.playLoop();
    }
    public void MonsterSpawn(){
        //if(Greenfoot.getRandomNumber(150)==1){
          //  int x = Greenfoot.getRandomNumber(getWidth());
            //addObject(new Monster(), 50 , 550);
           // addObject(new Monster(), 1000 , 550);
           //Monster mon = new Monster();
           if(temp % 6 == 0){
               ran = Greenfoot.getRandomNumber(50);
               
               if(ran % 4 == 0){
                     int mon = Greenfoot.getRandomNumber(50);
                   if(mon % 21 == 3){
                       addObject(new Monster(), 1000, 550);
                    }if(mon %19==1){
                       addObject(new Monster2(), 1000, 550);
                     
                    }
                
               }
            }
            temp++;
            
    }

     public void act(){
       MonsterSpawn();
       Sound();
       showText("Score: " + score, 488 ,59);
       showText("Life: " + life, 700 ,59);
       if(life ==0){
           Greenfoot.setWorld(new GameOver());
       myMusic.pause();
        }
        
    }
}
