import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int anzahl;
    private int counter;
    private int direction;

    public Enemy(){
        anzahl = 0;
        counter = 0;
        direction = 20;
    }

    /*bewegen():
     * Diese Methode bewegt natürlich das Objekt. Immer einen Schritt in die Richtung und beim nächsten Mal
     * einen Schritt in die Gegenrichtung. Nach vier "Schritten" (gezählt durch das Attribut anzahl), soll 
     * das Objekt einen Schritt nach unten machen.
     */
    public void bewegen(){
        if(anzahl == 0){
            setLocation(getX()+direction, getY());
        }
        else if(anzahl == 1){
            setLocation(getX()-direction, getY());
        }
        else if(anzahl == 2){
            setLocation(getX()+direction, getY());
        }
        else if(anzahl == 3){
            setLocation(getX()-direction, getY());
        }
        else if(anzahl == 4){
            setLocation(getX(), getY()+direction);
        }
        anzahl++;
        if (anzahl == 5){
            anzahl = 0;
        }
    }

    /*checkLoss()
     * Wenn das Objekt den Helden isTouching(Hero.class) oder den Rand berührt hat man verloren und erzeugt
     * das Verliereschild: getWorld().addObject(new Winner(1), 450, 300);
     */
    /*act()
     * Das Objekt soll sich bewegen. Damit die Bewegung aber nicht zu schnell ist, wird eine künstliche 
     * Verzögerung eingebaut. Diese funktioniert über das Attribut counter. Bei jedem Aufruf von act wird 
     * dieser erhöht. Bei jedem 40. Mal bewegt sich das Objekt.
     * Nebenbei muss es natürlich ständig prüfen, ob der Held verloren hat.
     */
    public void act(){
        bewegen();
    }

}
