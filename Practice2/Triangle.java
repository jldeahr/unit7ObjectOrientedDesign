import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle
{
    private Point2D.Double point1, point2, point3;
    private Line2D.Double line1, line2, line3;

    public Triangle()
    {
        point1 = new Point2D.Double(0,0);
        point2 = new Point2D.Double(0,0);
        point3 = new Point2D.Double(0,0);
        line1 = new Line2D.Double(0,0,0,0);
        line2 = new Line2D.Double(0,0,0,0);
        line3 = new Line2D.Double(0,0,0,0);
    }
}
