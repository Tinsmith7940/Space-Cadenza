package space.cadenza.levels;
import java.awt.Component;
import javax.swing.JFrame;

public class Runner extends JFrame{

	public Runner()
	{super("Scrolling Background Demo");
	setSize (1000, 750);
	
	ScrollingBackground back = new ScrollingBackground();
	((Component)back).setFocusable(true);
	getContentPane().add(back);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}

	public static void main(String[] args) {
		new Runner();
	}
	
}
