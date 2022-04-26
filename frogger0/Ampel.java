import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ampel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ampel extends Actor
{
    private Frosch unserFrosch;
    private String farbe;

    public void act() 
    {
        checkBeruehren();
    }    

    public Ampel(Frosch f) {
        unserFrosch = f;
        farbe = "gruen";
    }

    public void umschalten(String f) {
        farbe = f;
        if(f == "rot") {
            setImage("ampel_r.gif");
        }
        
    }

    public void checkBeruehren() {
        if(intersects(unserFrosch)) {
            umschalten("rot");
        }
    }
    
        public String getFarbe() {
        return farbe;
    }
}