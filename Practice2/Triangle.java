import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle
{
    private Line2D.Double line1, line2, line3;
    private int[] record;

    public Triangle(int[] record)
    {
        for (int i = 0; i < record.length; i++)
        {
            record[i] = record[i];
        }
    }
    
    public void draw(Graphics2D g2)
    {
        line1 = new Line2D.Double(record[0],record[2],record[1],record[3]);
        line2 = new Line2D.Double(record[2],record[4],record[3],record[5]);
        line3 = new Line2D.Double(record[4],record[0],record[5],record[1]);
        
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        
    }
}
