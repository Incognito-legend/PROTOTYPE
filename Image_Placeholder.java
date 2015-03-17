import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image_Placeholder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image_Placeholder extends PLAYER
{
    public void Act() 
    {
        WORLD level = (WORLD)this.getWorld();
        if (Class_Selection){
          System.out.println("Choose Your Class!");
          System.out.println("Class_Paladin = Key 1");
          System.out.println("Class_Lord    = Key 2");
          System.out.println("Class_Warrior = Key 3");
          Class_Selection = false;
        }
        
        if (!(Class_Selection) && !(CS_Complete)){
            
          if (Greenfoot.isKeyDown("1")){
              
              System.out.println("You've Chosen the Paladin Class!");
              
              level.addObject(new Class_Paladin(), 512, 389);
            
          } else if (Greenfoot.isKeyDown("2")){
              
              System.out.println("You've Chosen the Lord Class!");
              
              level.addObject(new Class_Lord(), 512, 389);
              
          } else if (Greenfoot.isKeyDown("3")){
              
              System.out.println("You've Chosen the Warrior Class!");
              
              level.addObject(new Class_Warrior(), 512, 389);
    
          }
    
        }
}
}

