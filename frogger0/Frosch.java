import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frosch here.
 * 
 * @author Patrick Krusch 
 * @version (a version number or a date)
 */
public class Frosch extends Actor {

    private String bezeichnung;
    private boolean lebendig;
    private int spieler;

    public void act(){
        if(lebendig) {
            if(spieler == 0) {
                if(Greenfoot.isKeyDown("w")) {
                    schritt();
                }
                if(Greenfoot.isKeyDown("a")) {
                    rechtsDrehen();
                }
                if(Greenfoot.isKeyDown("d")) {
                    linksDrehen();
                }
            }
            if(spieler == 1) {
                if(Greenfoot.isKeyDown("up")) {
                    schritt();
                }
                if(Greenfoot.isKeyDown("right")) {
                    rechtsDrehen();
                }
                if(Greenfoot.isKeyDown("left")) {
                    linksDrehen();
                }
            }
        } 
    }

    public Frosch(int s){
        bezeichnung = "frosch";
        lebendig = true;
        spieler = s;
    }

    public void schritt(){
        move(20);
    }

    public void rechtsDrehen(){
        turn(90);
    }

    public void linksDrehen(){
        turn(-90);
    }

    public void sprung(int x, int y) {
        setLocation(x,y);
    }

    public void gameOver() {
        lebendig = false; 
        setImage("cross.png");
        setRotation(0);
    }

    public void revive() {
        lebendig = true;
        setImage("frog.png");
        setLocation(240, 479);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String b) {
        bezeichnung = b;
    }
}
