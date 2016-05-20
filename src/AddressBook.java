/**
 * Ms.Dyke
 * Nicole Kozlova
 * April 21,2016
 * 
 * This is the driver class. It creates JLabels and JTextFields where user caqn input data. 
 * It adds them all to the JFrame. 
 * 
 * @author Nicole Kozlova
 * @version 1 04.21.16
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.*;
import javax.swing.JOptionPane;
/** This program will sumbit, update, scroll through records, save records, open records. It
  * adds a new record to an array list. Sumbit update alters the text in the textfields and creates new
  * records. Next and Back allows us to go through the records created
  * 
  * <p>
  * <b>Instance variables: </b> 
  * <p>
  * <b>PersonRecord</b>  creates an object of the class
  *  <p>
  * <b>persons</b>  creates an array list of the class PersonRecord
  *  <p>
  * <b>label</b>  creates an instance array of JLable
  *  <p>
  * <b>labelName</b>  creates an instance array of a String
  * <p>
  * <b>buttonName</b>  creates an instance array of a String
  * <p>
  * <b>textInTheField</b>  creates an instance array of a String
  * <p>
  * <b>textField</b>  creates an instance array of JTextField
  * <p>
  * <b>button</b>  creates an instance array of a JButton
  * <p>
 **/
public class AddressBook extends JPanel implements ActionListener
{
 // PersonRecord p;
  JLabel [] label = new JLabel [5];
  String [] labelName = new String [5];
  String [] buttonName = new String [5];
  String [] textInTheField = new String[2];
  JTextField [] textField = new JTextField[6];
  JButton [] button = new JButton[5];
  //File fileName;
 
  /**
   * This is the constructer of Address book
   **/
  public AddressBook ()
  { 
    
  }
  /** This creates the textFields, the labels and the buttons onto the screen. 
    * I use an absolute layout to design where each goes. The for loops are used to create 
    * multiple textField, labels, buttons. It simplifies the code. I assign each button and label array
    * with text.
    * 
    * <p>
    * <b>Local variables: </b> 
    * <p>
    * <b>PersonRecord</b>  creates an objext of the class
    * <p>
   **/
  public void createDisplay(Container pane)
  {
    pane.setLayout(null);
    removeAll();
    Insets insets = this.getInsets();
    
    
    labelName [0] = ("First Name: ");
    labelName [1] = ("Last Name: ");
    labelName [2] = ("Phone Number: ");
    labelName [3] = ("Email: ");
  
    
    buttonName [0] = ("<<BACK<<");
    buttonName [1] = (">>NEXT>>");
    buttonName [2] = ("SUBMIT");
    buttonName [3] = ("DELETE");
    buttonName [4] = ("UPDATE");
    
    
    textInTheField [1]=( "Record of");
    textInTheField [0]=("File Name: "); 
   
    // creates 4 labels
    for (int x = 0; x <4; x++)
    {
      label [x]= new JLabel (labelName[x]);
      Dimension size = label [x].getPreferredSize();
      label [x].setBounds(15 + insets.left, 30*x + insets.top+50,size.width, size.height+5);
      pane.add (label[x]); 
    }
    //text field
     for (int x = 2; x <6; x++)
    {
      textField [x] = new JTextField (15);
      Dimension size = textField[x].getPreferredSize();
      textField [x].setBounds(200 + insets.left, 30* (x - 2) + insets.top+50,size.width+80, size.height+5);
     textField[x].setEnabled(false);
      pane.add (textField[x]); 
    }
    //file Name and record number
    for (int x = 0; x <2; x++)
    {
      textField [x]= new JTextField (textInTheField[x]);
      Dimension size =textField [x].getPreferredSize();
      textField [x].setBounds(200 + insets.left, 295*x+ insets.top+15,size.width + 10, size.height+5);
      textField[x].setEnabled(false);
      pane.add (textField[x]);
    }
    
    // add, delete, update buttons
    for (int b = 2; b <5; b++)
    {
      button [b] = new JButton (buttonName[b]);
      
      Dimension size = button [b].getPreferredSize();
      button [b].setBounds(200 + insets.left, 40*b + insets.top+100,size.width, size.height+5);
      pane.add (button[b]);
    }
    // back and next button
    for (int b = 0; b <2; b++)
    {
      button [b] = new JButton (buttonName[b]);
      
      Dimension size = button [b].getPreferredSize();
      button [b].setBounds(370*b+ insets.left +10,insets.top+295,size.width, size.height);
      pane.add (button[b]);
    } 
    for (int b = 0; b <  5; b++)
    {
      button[b].addActionListener (this);
    }
    revalidate();
    repaint();
    textField [0].requestFocusInWindow();
  }
    public void actionPerformed (ActionEvent ae)
  {
    if (ae.getActionCommand ().equals (button[2]))
    {
    }
    else if (ae.getActionCommand ().equals (button[3]))
    {
    }
    else if (ae.getActionCommand ().equals (button[0]))
    {
    }
    else if (ae.getActionCommand ().equals (button[1]))
    {
    }
    else
    {
    }
    }
 
}