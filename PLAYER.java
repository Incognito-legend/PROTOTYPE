import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAYER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER extends Actor
{
    String baseString = "";
    String left1;
    String left2;
    String left3;
    String right1;
    String right2;
    String right3;
    String down1;
    String down2;
    String down3;
    String up1;
    String up2;
    String up3;
    //-------------------------
    String lastWayFacing = "down";
    
    int whichWalk = 0;
    int Lord = 1;
    int Paladin = 2;
    int Class;
    public void act() 
    {
        WORLD level = (WORLD)this.getWorld();

        int hero_x_px = -level.pos_x + getX();
        int hero_y_px = -level.pos_y + getY();
        int hero_x = hero_x_px/96;
        int hero_y = hero_y_px/96;

        
        if (Greenfoot.isKeyDown ("left")){
       
       level.scroll(10, 0);
       
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(-10, 0);
      }
      
        if (whichWalk == 0) {
          
           
                
            setImage(left1);
            
            
            
        } else if (whichWalk == 1) {
              
           
                
            setImage(left2);
            
           
          
        } else if (whichWalk == 2) {
            
            
            
            setImage(left3);
            
            
            
        } else if (whichWalk == 3) {
            
            
                
            setImage(left2);
            
            
            
          }
          
     
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "left";
        System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    
}else if (Greenfoot.isKeyDown ("right")){

       
       WORLD x = (WORLD)this.getWorld();
       x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(10, 0);
        }
        
        if (whichWalk == 0) {
          

                
            setImage(right1);
            
           
          
        } else if (whichWalk == 1) {
              

                
            setImage(right2);
            
           
          
        } else if (whichWalk == 2) {
            

                
            setImage(right3);
            
          
            
        } else if (whichWalk == 3) {
            
                
            setImage(right2);
            
          
          
        }
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "right";
        System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    
} else if (Greenfoot.isKeyDown("up")){

       WORLD x = (WORLD)this.getWorld();
       x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(0, -10);
        }
        
      if (whichWalk == 0) {
                
            
          setImage(up1);
            
           
          
        } else if (whichWalk == 1) {
              
        
                
          setImage(up2);
            
           
          
        } else if (whichWalk == 2) {
            
            
                
          setImage(up3);
            
          
            
        } else if (whichWalk == 3) {
            

                
          setImage(up2);
            
          
          
        }
        whichWalk = (whichWalk + 1) % 4;  
        lastWayFacing = "up";
        System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    } else if (Greenfoot.isKeyDown("down")){
       
       WORLD x = (WORLD)this.getWorld();
       x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(0, 10);
        }
        
        if (whichWalk == 0) {
            
            setImage(down1);
          
        } else if (whichWalk == 1) {
            
            setImage(down2);
            
        } else if (whichWalk == 2) {
           
            setImage(down3);
         
        } else if (whichWalk == 3) {
            
            setImage(down2);
          
        }
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "down";
        System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
}else if (lastWayFacing.equals("up")){
                    
            setImage(up2);
           
        } else if (lastWayFacing.equals("down")){
           
            setImage(down2);
     
        } else if (lastWayFacing.equals("left")) {
            
            setImage(left2);
       
        } else if (lastWayFacing.equals("right")) {
          
            setImage(right2);
           
    }
}
}

 
