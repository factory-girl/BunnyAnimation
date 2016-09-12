import java.awt.Graphics;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.*;
import javax.swing.*;


public class BunnyComponent extends JComponent{
	
	private BufferedImage img;
	private int xLeft;
	private int yTop;
	private URL url;
	
	public BunnyComponent() {
		xLeft = 0;
		yTop = 0;
		try {
			url = new URL("http://www.mckaylareilly.com/default.png");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
	           img = ImageIO.read(url);
	       } catch (IOException e) {
	    }
	}
	
	public void paint(Graphics g) {
        g.drawImage(img, xLeft, yTop, null);
    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
    
    /**
	 Moves the bunny by a given amount.
	 @param dx the amount to move in the x-direction
	 @param dy the amount to move in the y-direction
	 */
		 public void moveBunnyBy(int dx, int dy)
		 {
			 xLeft = xLeft + dx;
			 yTop = yTop + dy;
			 repaint();
		 }
}
