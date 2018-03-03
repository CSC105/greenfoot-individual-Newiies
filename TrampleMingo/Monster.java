import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
   GreenfootImage image1 = new GreenfootImage("mo1.png");
   GreenfootImage image2 = new GreenfootImage("mo2.png");
   // GreenfootImage [] imagesLeft = new GreenfootImage[2];
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //int i = 0 ;
    int img = 0;
    int temp = 0;
   /* public Monster(){
        for(int i = 0 ; i < images.length ; i++){
            images[i] = new GreenfootImage("mo"+(i+1)+".png");
            imagesLeft[i] = new GreenfootImage("mo"+(i+1)+".png");
            imagesLeft[i].mirrorHorizontally();
            imagesLeft[i].scale(150,100);
            images[i].scale(150,100);
    }
    setImage(images[0]);*/

   /* public void runMonster(){
        if (getX() >500){
            setLocation(getX()-1,getY());
        }else if (getX() <500){
            setLocation(getX()+1,getY());
        }
        if(getX() == 1023){
            getWorld().removeObject(this);
        }
    }*/
    public void act() 
    {
        // Add your action code here.
        //Animation();
        //moveAround();
        //run();
        //runMonster();
        image1.scale(150,100);
        image2.scale(150,100);
        move(-2);
        if(getX() == 20){
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
       
        

    }
   /*public void moveAround(){
        move(4);
        turn(Greenfoot.getRandomNumber(20));
        
    }
    /*public void Animation(){
        if( getX() %2 == 0 ){
         setImage("mo1.png");

        }else if(getX()%2 == 1){
           setImage("mo2.png");
           
        }
        /*if(getX() == 998){
            removeObject(this);
        }*/
    }

