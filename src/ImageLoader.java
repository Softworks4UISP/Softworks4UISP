import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
/**
 **/
public class ImageLoader 
{
  
  public static BufferedImage loadImage (String path)
  {
    try
    {
      return ImageIO.read(ImageLoader.class.getResource(path));
    } 
    catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
    return null;
  }
  
}
