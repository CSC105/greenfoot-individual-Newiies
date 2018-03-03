import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingos extends Actor
{ 
    GreenfootImage [] images = new GreenfootImage[36];
    GreenfootImage [] imagesLeft = new GreenfootImage[36];
    int img = 0;
    private final int GRAVITY = 1;
    private int velocity;
   
        
    
    public Flamingos(){
        for(int i = 0 ; i < images.length ; i++){
            images[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
            imagesLeft[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
            imagesLeft[i].mirrorHorizontally();
            imagesLeft[i].scale(125,170);
            images[i].scale(125,170);
        }
        setImage(images[0]);
        velocity = 4;
    }
    
    public void run(){
        if(Greenfoot.isKeyDown("Right")){
            if(img < 35){ img++;
            }else{ img=0;
            }
            setLocation(getX()+3,getY());
            setImage(images[img]);
            
        }else if(Greenfoot.isKeyDown("Left")){
            if(img < 35){ img++;
            }else{ img=0;
            }
            setLocation(getX()-3,getY());
            setImage(imagesLeft[img]);
         
        } 
    }
    public void act() 
    {
        // Add your action code here.
        //Flamingo();
        run();
        fall();
        if(Greenfoot.isKeyDown("Up") && getY() > getWorld().getHeight() - 160) Jump();
        
        remove();
    }    
    public void fall(){
        setLocation(getX(),getY() + velocity);
        if(getY() > getWorld().getHeight() - 160) velocity = 0;
        else velocity += GRAVITY;
    }
    public void Jump(){
         velocity = -15;
       
    }
    
    public boolean onHead(){
        if(getOneObjectAtOffset(0,getImage().getHeight()-20,Monster.class) != null){
           
           return true; 
        }else if(getOneObjectAtOffset(0,getImage().getHeight()-20,Monster2.class) != null){
           return true; 
        }
            return false;
        
    }
    
    public void remove(){
        Monster monster = (Monster) getOneIntersectingObject(Monster.class);
        Monster2 monster2 = (Monster2) getOneIntersectingObject(Monster2.class);
        if(onHead() == true){
            fall();
            
         //Jump();
         Myworld.score++;
         getWorld().removeObject(monster);
         getWorld().removeObject(monster2);
         
        }
    }
}

