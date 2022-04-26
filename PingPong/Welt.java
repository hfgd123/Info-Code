import greenfoot.*;

/**
 * Write a description of class Welt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welt extends World
{

    /**
     * Constructor for objects of class Welt.
     * 
     */
    public Welt()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Schlaeger schlaeger = new Schlaeger("up", "down");
        addObject(schlaeger,560,200);
        Schlaeger schlaeger2 = new Schlaeger("w", "s");
        addObject(schlaeger2,40,200);
        Ball ball = new Ball(8, 4, schlaeger, schlaeger2);
        addObject(ball,300,200);
    }
}
