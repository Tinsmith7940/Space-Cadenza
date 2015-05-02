package space.cadenza;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import space.cadenza.enums.GameState;
import space.cadenza.screens.MainMenu;
import space.cadenza.graphics.Renderer;
import space.cadenza.screens.MainMenu;


/**
 * @author Peter
 *
 */
public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 5363162066719528344L;
	
	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH / 4*3;
	public static final String TITLE = "The Space Cadenza";
	private static Game game = new Game();
	
	public static GameState state = GameState.MENU;
	
	private boolean running = false;
	private Thread thread;
	
	private Renderer graphics;
	
	private JLabel image_pane;
	
	public static Game getInstance(){
		return game;
	}
	
	
	
	public void init(){
		MainMenu.create();
		graphics = new Renderer();
	}
	
	public void tick(){
		
	}
	
	public void renderBackground(Graphics g){
		
	}
	
	public void renderForeground(Graphics g){

	}
	
	public void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
//		g.setColor(Color.BLUE);
//		g.setColor(new Color(10,0,50));
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		////////////////////////
		graphics.renderBackground(g);
		graphics.renderForeground(g);
		
		g.dispose();
		bs.show();
	}
	
	
	@Override
	public void run() {	
		init();
		long lastTime = System.nanoTime();
		final double numTicks = 60.0;
		double n = 1000000000 / numTicks;
		double delta = 0;
		int frames = 0;
		int ticks = 0;
		long timer = System.currentTimeMillis();
		
		while(running){
			long currentTime = System.nanoTime();
			delta += (currentTime - lastTime) / n;
			lastTime = currentTime;
			
			if(delta >= 1){
				tick();
				ticks++;
				delta--;
			}
			
			render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000){
				timer+=1000;
//				System.out.println(ticks + " Ticks, FPS: " + frames);
				ticks = 0;
				frames = 0;
			}
		}
		stop();
		
	}
	
	public static void main(String args[]){
		makeFrame();
		game.start();
		
	}
	
	private static void makeFrame(){
		JFrame frame = new JFrame(TITLE);
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = (JPanel)frame.getContentPane();
		
		JLabel image_pane = new JLabel();
		image_pane.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
		content.add(image_pane, BorderLayout.LINE_START);
		
		try
		{
		BufferedImage image = ImageIO.read(new File("images/SpaceShip.png"));
		image_pane.setIcon(new ImageIcon(image));
		}
		catch (Exception e)
		{}
		
		
		frame.setFocusable(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.pack();
	}
	
	private synchronized void start(){
		if(running)
			return;
		else
			running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	private synchronized void stop(){
		if(!running)
			return;
		else
			running = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(1);
	}

}
