import greenfoot.*;

/**
 * Write a description of class Ball here.
 * 
 * @author Krusch Patrick
 * @version 24.06.15
 */
public class Ball extends Actor
{
    private int speedX;
    private int speedY;
    private int punkte1;
    private int punkte2;
    private Schlaeger schlaeger1;
    private Schlaeger schlaeger2;
    private boolean berührtSchlaeger1 = false; 
    private boolean berührtSchlaeger2 = false; 

    public Ball(int x, int y, Schlaeger s1, Schlaeger s2){
        speedX = x;
        speedY = y;
        punkte1 = 0;
        punkte2 = 0;
        schlaeger1 = s1;
        schlaeger2 = s2;
        //Die Geschwindigkeit kann zu Beginn festgelegt werden
    }

    public void act() 
    {
        bewegen();
        punkteGeben();
        spielEnde();
        checkSchlaeger();
        // Add your action code here.
    }   

    public void bewegen(){
        setLocation(getX() + speedX, getY() + speedY);
        if(getX() <= 0 || getX() >= 599) {
            abprallenX();
        }
        if(getY() <= 0 || getY() >= 399) {
            abprallenY();
        }
        //Hier soll die Bewegung des Balls realisiert werden
    }

    public void punkteGeben() {
        if(getX() <= 0) {
            punkte1++;
        }
        if(getX() >= 599) {
            punkte2++;
        }
    }

    public void spielEnde() {
        if(punkte1 >= 11) {
            speedX = 0;
            speedY = 0;
            System.out.println("Spieler 1 hat gewonnen");
            setLocation(300, getY());
            punkte1 = 0;
        }
        if(punkte2 >= 11) {
            speedX = 0;
            speedY = 0;
            System.out.println("Spieler 2 hat gewonnen");
            setLocation(300, getY());
            punkte2 = 0;
        }
    }

    public void abprallenX() {
        speedX = speedX * -1;
    }

    public void abprallenY() {
        speedY = speedY * -1;
    }

    public void checkSchlaeger() {
        if(intersects(schlaeger1)) {
            if(berührtSchlaeger1 == false) {
                abprallenX();
                berührtSchlaeger1 = true;
            }
        }
        else {
            berührtSchlaeger1 = false;
        }
        if(intersects(schlaeger2)) {
            if(berührtSchlaeger2 == false) {
                abprallenX();
                berührtSchlaeger2 = true;
            }
        }
        else {
            berührtSchlaeger2 = false;
        }
    }

    public int getScore1(){
        return punkte1;
    }
    
    public int getScore2(){
        return punkte2;
    }
    
}



/*public GreenfootImage(int width,
                      int height)
 * 
 *         text = ball.getScore1() + " : " + ball.getScore2();
 * 
 * /
 */