import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image_Placeholder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image_Placeholder extends PLAYER
{
    public Image_Placeholder() 
    {
        World level = (World)this.getWorld();

//         if (!(Class_Selection) && !(CS_Complete)){
//      
//            if (Character == 1){
//               
//               System.out.println("You've Chosen the Paladin Class!");
//               
//               level.addObject(new Class_Paladin(), 512, 389);
//               
//               Class_Selection = true;
//               
//               CS_Complete = true;
//               
//           } else if (Character == 2){
//               
//               System.out.println("You've Chosen the Lord Class!");
//               
//               level.addObject(new Class_Lord(), 512, 389);
//               
//               Class_Selection = true;
//               
//               CS_Complete = true;
//               
//          } else if (Character == 3){
//               
//               System.out.println("You've Chosen the Warrior Class!");
//               
//               level.addObject(new Class_Warrior(), 512, 389);
//               
//               Class_Selection = true;
//               
//               CS_Complete = true;
//     
//          }
//     
//         }
        if (!(Class_Selection) && !(CS_Complete)){
        
        switch (Character) {

          case 1:
             if (!(this instanceof Class_Paladin)){
               level.removeObject(this);
               level.addObject(new Class_Paladin(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Paladin ] !");
               Character = 1;
             }
          break;
          case 2:
             if (!(this instanceof Class_Lord)){
               level.removeObject(this);
               level.addObject(new Class_Lord(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Lord ] !");
               Character = 2;
             }
            
          break;
          case 3:
             if (!(this instanceof Class_Warrior)){
               level.removeObject(this);
               level.addObject(new Class_Warrior(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Warrior ] !");
               Character = 3;
             }
          break;
          
        }
        
    }
}
}

