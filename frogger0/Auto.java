import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto extends Actor
{
    private int geschwindigkeit;
    private Frosch unserFrosch;
    private Ampel dieAmpel;
    
    public void act() {
        if(dieAmpel.getFarbe() == "gruen"){
            if(isAtEdge() && getX() != 0) {
                setLocation(0, getY());
            }
            else {
                fahren();
            }
            checkUeberfahren();
        }
    }

    public Auto(int g, Frosch f, Ampel a){
        geschwindigkeit = g;
        unserFrosch = f;
        dieAmpel = a;
    }

    public void checkUeberfahren() {
        if(intersects(unserFrosch)) {
            unserFrosch.gameOver();
        }
    }

    public void fahren() {
        move(geschwindigkeit);
    }

    public void setGeschwindigkeit(int v) {
        geschwindigkeit = v;
    }

    
}
