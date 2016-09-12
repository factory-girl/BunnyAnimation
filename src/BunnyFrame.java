import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

 /**
 This frame contains a moving bunny.
 */
 public class BunnyFrame extends JFrame
 {
	 
	 private static final int FRAME_WIDTH = 600;
	 private static final int FRAME_HEIGHT = 800;
	
	 private BunnyComponent scene;

	 class TimerListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent event)
		 {
		     scene.moveBunnyBy(1, 1);
		 }
	 }

	 public BunnyFrame()
	 {
		 scene = new BunnyComponent();
		 add(scene);
		
		 setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		 ActionListener listener = new TimerListener();
		
		 final int DELAY = 50; // Milliseconds between timer ticks
		 Timer t = new Timer(DELAY, listener);
		 t.start();
	 }
 }