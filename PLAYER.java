import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of Character PLAYER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAYER extends Actor
{
//     String baseString = "";
//     String left1;
//     String left2;
//     String left3;
//     String right1;
//     String right2;
//     String right3;
//     String down1;
//     String down2;
//     String down3;
//     String up1;
//     String up2;
//     String up3;
// 
//     String lastWayFacing = "down";
//     
//     int whichWalk = 0;
//     int Character = 2;
//     int HP = 100;
//     boolean Character_Selection = true;
//     boolean CS_Complete = false;
//     
//     public void act_PLAYER() 
//     {
//         WORLD level = (WORLD)this.getWorld();
// 
//         int hero_x_px = -level.pos_x + getX();
//         int hero_y_px = -level.pos_y + getY();
//         int hero_x = hero_x_px/96;
//         int hero_y = hero_y_px/96;
//         
// if (Greenfoot.isKeyDown("1") && !(CS_Complete)){
//         
//       Character = 1;
//     
// }else if (Greenfoot.isKeyDown("2") && !(CS_Complete)){
//         
//       Character = 2;
//     
// }else if (Greenfoot.isKeyDown("3") && !(CS_Complete)){
//         
//       Character = 3;
// 
// }   
//  
// if (Greenfoot.isKeyDown ("left")){
//        
//        level.scroll(10, 0);
//        
//        hero_x_px = -level.pos_x + getX()-50;
//        hero_y_px = -level.pos_y + getY();
//        hero_x = hero_x_px/96;
//        hero_y = hero_y_px/96;
//        
//       if (level.getTileAt (hero_x, hero_y) == 1001){
//           level.scroll(-10, 0);
//       }
//       
//         if (whichWalk == 0) {
//           
//             setImage(left1);
//             
//         } else if (whichWalk == 1) {
//                 
//             setImage(left2);
//             
//         } else if (whichWalk == 2) {
//           
//             setImage(left3);
//         
//         } else if (whichWalk == 3) {
//            
//             setImage(left2);
//           
//           }
//           
//         whichWalk = (whichWalk + 1) % 4;
//         lastWayFacing = "left";
//         System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
//     
// }else if (Greenfoot.isKeyDown ("right")){
// 
//        WORLD x = (WORLD)this.getWorld();
//        x.scroll(-10, 0);
//        hero_x_px = -level.pos_x + getX()+50;
//        hero_y_px = -level.pos_y + getY();
//        hero_x = hero_x_px/96;
//        hero_y = hero_y_px/96;
//        
//       if (level.getTileAt (hero_x, hero_y) == 1001){
//           level.scroll(10, 0);
//         }
//         
//         if (whichWalk == 0) {
//             
//             setImage(right1);
//        
//         } else if (whichWalk == 1) {
//      
//             setImage(right2);
//           
//         } else if (whichWalk == 2) {
//      
//             setImage(right3);
//             
//         } else if (whichWalk == 3) {
//           
//             setImage(right2);
//        
//         }
//         
//         whichWalk = (whichWalk + 1) % 4;
//         lastWayFacing = "right";
//         System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
//     
// } else if (Greenfoot.isKeyDown("up")){
// 
//        WORLD x = (WORLD)this.getWorld();
//        x.scroll(0, 10);
//        hero_x_px = -level.pos_x + getX();
//        hero_y_px = -level.pos_y + getY();
//        hero_x = hero_x_px/96;
//        hero_y = hero_y_px/96;
//        
//       if (level.getTileAt (hero_x, hero_y) == 1001){
//           level.scroll(0, -10);
//         }
//         
//       if (whichWalk == 0) {
//          
//           setImage(up1);
//     
//         } else if (whichWalk == 1) {
//       
//           setImage(up2);
//           
//         } else if (whichWalk == 2) {
//        
//           setImage(up3);
//      
//         } else if (whichWalk == 3) {
//     
//           setImage(up2);
//     
//         }
//         
//         whichWalk = (whichWalk + 1) % 4;  
//         lastWayFacing = "up";
//         System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
//         
//     } else if (Greenfoot.isKeyDown("down")){
//        
//        WORLD x = (WORLD)this.getWorld();
//        x.scroll(0, -10);
//        hero_x_px = -level.pos_x + getX();
//        hero_y_px = -level.pos_y + getY()+40;
//        hero_x = hero_x_px/96;
//        hero_y = hero_y_px/96;
//        
//       if (level.getTileAt (hero_x, hero_y) == 1001){
//           level.scroll(0, 10);
//         }
//         
//         if (whichWalk == 0) {
//             
//             setImage(down1);
//           
//         } else if (whichWalk == 1) {
//             
//             setImage(down2);
//             
//         } else if (whichWalk == 2) {
//            
//             setImage(down3);
//          
//         } else if (whichWalk == 3) {
//             
//             setImage(down2);
//           
//         }
//         
//         whichWalk = (whichWalk + 1) % 4;
//         lastWayFacing = "down";
//         System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
//         
// }else if (lastWayFacing.equals("up")){
//                     
//             setImage(up2);
//            
//         } else if (lastWayFacing.equals("down")){
//            
//             setImage(down2);
//      
//         } else if (lastWayFacing.equals("left")) {
//             
//             setImage(left2);
//        
//         } else if (lastWayFacing.equals("right")) {
//           
//             setImage(right2);
//            
// 
//   
//  
//  }
// }
// }
// 
//  
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
    
   
    String lastWayFacing = "down";
    int whichWalk = 0;
    int HP = 100;
    boolean Character_Selection = true;
    boolean CS_Complete = false;
    public void act() 
    {
        WORLD level = (WORLD)this.getWorld();
        int hero_x_px = -level.pos_x + getX();
        int hero_y_px = -level.pos_y + getY();
        int hero_x = hero_x_px/96;
        int hero_y = hero_y_px/96;
        boolean dirtyFlag = true;
        boolean dirtyFlag1 = true;
        int Character = 4;
        // Movement and controls section
        if (Greenfoot.isKeyDown ("left"))
    {
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
    }
  
        else  if (Greenfoot.isKeyDown ("right"))
    {
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
    }

        else if (Greenfoot.isKeyDown("up"))
    {
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
    }
    
        else if (Greenfoot.isKeyDown("down"))
    {   
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
    } 
    
    else 
    {
        
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        
    }
    
    // Tile Definitions
       if (level.getTileAt(hero_x, hero_y) == 1003){
        System.out.println("You're at your house!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1004){
        System.out.println("You're at the Arena!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1005 && (dirtyFlag1 == true)){
        dirtyFlag1 = false;
        level.removeObject(this);
        System.out.println("Welcome to the Blacksmith!");
    }
       if (level.getTileAt(hero_x, hero_y) == 1006){
        System.out.println("Welcome to the Shop!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1007 && !(this instanceof Class_Warrior)){
        level.removeObject(this);
        level.addObject(new Class_Warrior(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Warrior ] !");
        Character = 1;
    }
       if (level.getTileAt(hero_x, hero_y) == 1008 && !(this instanceof Class_Paladin)){
        level.removeObject(this);
        level.addObject(new Class_Paladin(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Paladin ] !");
        Character = 2;
    }
       if (level.getTileAt(hero_x, hero_y) == 1009 && !(this instanceof Class_Lord)){
        level.removeObject(this);
        level.addObject(new Class_Lord(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Lord ] !");
        Character = 3;
    }
       if (level.getTileAt(hero_x, hero_y) == 1012 && (Greenfoot.isKeyDown ("Space") && (dirtyFlag == true))){
           System.out.println("In Memory of Pluto, the riddle master!");
           System.out.println("You're Standing on a Portal!");
           dirtyFlag = false;
    }
       if (!(level.getTileAt(hero_x, hero_y) == 1012)){
           dirtyFlag = true;
           
    }   
}
}