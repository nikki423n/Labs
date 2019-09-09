import apcslib.*;
/**
 * Write a description of class Benzene here.
 *
 * @author Nicole Nguyen
 * @version (a version number or a date)
 */
public class Benzene
{
    public static void main(String args[])
    {
        DrawingTool pencil;
        SketchPad pad;
        
        pad = new SketchPad(600, 600);
        pencil = new DrawingTool (pad);
        pencil.drawCircle(50);
        pencil.up();
        pencil.turnRight(90);
        pencil.move(90);
        pencil.down();
        pencil.turn(60);
        for (int i = 0; i < 6; i++)
        {
            pencil.turn(60);
            pencil.move(90);
        }
    }
}
