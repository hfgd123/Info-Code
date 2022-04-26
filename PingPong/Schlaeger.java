import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Schlaeger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schlaeger extends Actor
{
    private String tasteHoch;
    private String tasteRunter;


    public void act() 
    {
        bewegen();
    }    

    public Schlaeger(String up, String down) {
        tasteHoch = up;
        tasteRunter = down;
    }

    public void bewegen() {
        if(Greenfoot.isKeyDown(tasteHoch)) {
            setLocation(getX(), getY() - 10);                    
        }
        if(Greenfoot.isKeyDown(tasteRunter)) {
            setLocation(getX(), getY() + 10);
        }
    }
}
