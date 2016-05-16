import java.awt.image.BufferedImage;
/**
 * The AppAssets is the class that holds assets as Images in static BufferedImage Variables.
 * 
 * @author A Barenboim
 * @version 1.00.00
 * 
 * <b>Instance variables: </b>
 * <p>
 * <b>splashScreen </b> This creates an instance of the BufferedImage class.
 */
public class AppAssets {
  
  public static BufferedImage splashScreen;
  
  /**
   * This method intilizied the Buffered images.
   * 
   */
  public static void init (){
    splashScreen = (ImageLoader.loadImage("/graphics/Splash_Screen.png"));
  }
}
