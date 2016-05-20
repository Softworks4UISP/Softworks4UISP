import javax.swing.*;
import java.awt.*;
/**
 * The AppFrame is the class that creates the JFrame.
 * 
 * @author A Barenboim
 * @version 1.00.00
 */
public class AppFrame extends JFrame {
  
  Canvas myCanvas;
  
  public AppFrame() { 
    super ("Media Manager 4U");
    
    setSize (600, 400);
    setVisible (true);
    setResizable (false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    
    myCanvas = new Canvas();
    myCanvas.setPreferredSize(new Dimension(600, 400));
    myCanvas.setMaximumSize(new Dimension(600, 400));
    myCanvas.setMinimumSize(new Dimension(600, 400));
    myCanvas.setFocusable (false);
    
    add(myCanvas);
    pack();
  }
  
  public Canvas getCanvas() {
    return myCanvas;
  }
  
}
