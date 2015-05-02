package space.cadenza.screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import space.cadenza.Game;

public class MainMenu {
	
	private static Rectangle play, options, quit;
	private static int centerX = Game.WIDTH / 2;
//	private static int centerY = Game.HEIGHT /2;
	
	public static void create(){
		int fillerY = 150;
		play = new Rectangle(centerX - 100, fillerY, 200, 50);
		options = new Rectangle(centerX - 100, fillerY += 60, 200, 50);
		quit = new Rectangle(centerX - 100, fillerY += 60, 200, 50);
	}
	
	public static void drawButton(Graphics g, Rectangle r, String text, int offsetX){
		Font tempFont = new Font("Arial", Font.BOLD, 45);
		g.setFont(tempFont);
		g.setColor(Color.WHITE);
		
		g.drawRect(r.x, r.y, r.width, r.height);
		g.drawString(text, r.x + offsetX, r.y + 38);
	}
	public static void render(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
		drawButton(g, play, "Play", 55);
		drawButton(g, options, "Options", 15);
		drawButton(g, quit, "Quit", 55);
	}

}