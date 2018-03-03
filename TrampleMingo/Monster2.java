import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster2 extends Actor
{ GreenfootImage image1 = new GreenfootImage("m1.png");
   GreenfootImage image2 = new GreenfootImage("m2.png");
   int img = 0;
    int temp = 0;
    int life = 3;
    /**
     * Act - do whatever the Monster2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { image1.scale(175,125);
        image2.scale(175,125);
        move(-1);
        if(getX()  == 30){
           
          getWorld().removeObject(this);
          Myworld.life--;
        }
        if(temp % 14 == 0){
            if(getImage() == image1){
                setImage(image2);
            }else{
                setImage(image1);
            }
        }
        temp++;
       
        // Add your action code here.
    }    
}
