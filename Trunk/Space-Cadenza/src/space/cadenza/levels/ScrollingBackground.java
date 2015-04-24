package space.cadenza.levels;



import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ScrollingBackground extends Canvas implements Runnable {
private Background backOne;
private Background backTwo;
private BufferedImage back;

public ScrollingBackground() {
	backOne = new Background();
	backTwo = new Background(backOne.getImageWidth(), 0);
	
	new Thread(this).start();
	setVisible(true);
}

public void run(){
	try {
		while (true){
			Thread.currentThread().sleep(5);
			repaint();
		}
	}
	catch (Exception e) {}
}

public void paint(Graphics window){
	Graphics2D twoD = (Graphics2D)window;
	
	if (back == null)
		back = (BufferedImage)(createImage(getWidth(), getHeight()));

	Graphics buffer = back.createGraphics();
	
	backOne.draw(buffer);
	backTwo.draw(buffer);
	
	twoD.drawImage(back, null, 0, 0);
}
}