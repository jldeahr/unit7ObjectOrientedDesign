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
    private JComponent scene;
    
    public TriangleComponent()
    {        
        frame = new JFrame();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Triangle triangle = new Triangle();
        
        
    }
    
    class TriangleMouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
            repaint();
        }
        
        public void mouseReleased(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    public void frame()
    {
        scene = new JComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}