import greenfoot.*;

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private boolean reloaded;
    private boolean alive;
    private int enemies;

    public Hero(){
        reloaded = true;
        alive = true;
        enemies = 90;
    }

    public void act() 
    {
        if(alive) {
            if(reloaded){
                if(Greenfoot.isKeyDown("space")) {
                    fire();
                }
            }
            moving();

        }
        /*Ist das Objekt lebendig, kann es sich bewegen. Auch nur dann kann es auf Tastendruck schießen.
         * Ein Schuss ist nur möglich, wenn nachgeladen wurde (reloaded).
         */
    }    

    public void moving(){
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 20, getY());
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 20, getY());
        }
        // Auf Tastendruck soll sich das Objekt um 20 nach links und rechts bewegen können.
    }

    //Hierdurch wird geschossen. Nach Aufgabe 6 auskommentieren.
    public void fire(){
        Fire f = new Fire(this);
        getWorld().addObject(f, getX(),getY()-20);
        firecheck();
    }

    public void firecheck(){
        reloaded = !reloaded;
    }

    public void enemykilled(){
        enemies--;
        if (enemies == 0){
            getWorld().addObject(new Winner(0), 450, 300);
        }
    }

}
