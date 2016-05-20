import javax.swing.*;
import java.awt.*;
public class AppFrame2 extends JFrame
{
  AddressBook a = new AddressBook ();
  public AppFrame2() { 
    
    super ("Media Manager 4U");
    
    setSize (600, 400);
    
    this.add (a);
    a.createDisplay (this.getContentPane());
    setVisible (true);
    setResizable (false);
     setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
  }
 
 
}