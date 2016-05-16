
import java.awt.*;
import java.awt.image.BufferStrategy;

public class AppRunner implements Runnable{
    
    private AppFrame display;
    private BufferStrategy bs;
    private Graphics g;
    private boolean running = false;
    private Thread thread;
    
    public AppRunner () {

    }

    private void init() {
        display = new AppFrame();
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //earse
        g.clearRect(0, 0, 400, 400);
        //Draw Here!
        //for (int i = 0; i <= 400; i += 32){
        g.drawRect(0, 0, 600, 400);
        //}
        //end drawing!
        bs.show();
        //g.dispose();
    }

    public void run() {

        init();
        stop();

    }
    
    
    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {

        }
    }
}