import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Event_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event_1 extends PLAYER
{
boolean Class_Selection = true;
    public void act() 
    {
        if (Class_Selection){
          System.out.println("Choose Your Class!");
          System.out.println("Class_Paladin = Key 1");
          System.out.println("Class_Lord    = Key 2");
          System.out.println("Class_Warrior = Key 3");
          Class_Selection = false;
        }
    }    
}
