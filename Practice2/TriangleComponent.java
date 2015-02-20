import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

class TriangleComponent extends JComponent
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 100;
    private JFrame frame;
    public int[] record;
    
    public TriangleComponent()
    {        
        frame = new JFrame();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(this);
        
        MouseListener listener = new TriangleMouseListener();
        this.addMouseListener(listener);
        frame.setVisible(true);
    }
    
//     public void paintComponent(Graphics2D g)
//     {
//         Graphics2D g2 = (Graphics2D) g;
//         
//         Triangle triangle = new Triangle(record[]);
//         
//         
//     }
    
    class TriangleMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
            for (int i = 0; i < 6; i++)
            {
                if (i%2 == 0)
                {
                    record[i] = y;
                }
                else
                {
                    record[i] = x;
                }
            }
            
            
            repaint();
        }
        
        public void mouseReleased(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
    }
}