import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    private boolean alive;
    private Hero hero;

    public Fire(Hero h){
        alive = true;
        setRotation(270);
        hero = h;
    }

    public void act() 
    {
        if(alive){
            fly();
            kollision();
        }
        /*Falls das Objekt "lebt" (alive) fliegt es und prüft auf kollisionen.       
         */
    }    

    public void fly(){
        move(5);
        //Das Objekt bewegt sich 5 Schritte in Blickrichtung
    }

    public void kollision(){
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            alive = false;
            hero.firecheck();
            hero.enemykilled();
            getWorld().removeObject(this);
            return;
        }               
        if (alive && isAtEdge()){
            hero.firecheck();
            getWorld().removeObject(this);
            return;
        }
    }

}
