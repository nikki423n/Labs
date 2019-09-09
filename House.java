import apcslib.*;
/**
 * drawing a house
 *
 * @author Nicole Nguyen
 * @version (a version number or a date)
 */
public class House
{
    public static void main(String[] args)
    {
        DrawingTool pencil;
        SketchPad pad;
        pad = new SketchPad(600,600);
        pencil = new DrawingTool();

        pencil.up();
        pencil.move(-100);
        pencil.turn(-90);
        pencil.move(-100);
        pencil.turn(90);
        pencil.down();

        drawSquare(0, 0, 200, pencil);

        pencil.up();
        pencil.turn(90);
        pencil.move(200);
        pencil.turn(90);
        pencil.move(60);
        pencil.turn(180);
        pencil.down();
        pencil.move(60+60+200);
        pencil.turn(150);
        pencil.move(185);
        pencil.turn(60);
        pencil.move(185);

    }

    static void drawSquare(int x, int y, int length, DrawingTool pencil)
    {
        pencil.up();
        pencil.turnRight(90);
        pencil.down();
        for (int i = 0; i < 4; i++)
        {
            pencil.forward(length);
            pencil.turnLeft(90);
        }
    }
}