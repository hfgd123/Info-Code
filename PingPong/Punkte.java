import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Punkte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punkte extends Actor
{
        private Ball ball;
        private Color back;
        private Color fore = Color.BLACK;
        private Color back = new Color​(0 , 0, 0, 255);	
        private GreenfootImage text = new GreenfootImage(ball.getScore1() + " : " + ball.getScore2(), 20, fore, back);
    
    
    public Punkte(Ball b) {
        ball = b;
    }

    public void act()
    {
        // Add your action code here.
    }
}
