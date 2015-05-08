package cadenzaTest;

import java.awt.*;
import java.awt.event.KeyEvent;
 
import javax.swing.ImageIcon;
 
public class Bullet {
        int x, y, dy;
        Image still;
 
        public Bullet() {
                ImageIcon b = new ImageIcon("images/Bullet.png");
                still = b.getImage();
                x = 100;
                y = 600;
                dy = 0;
        }
        public void setX(int n){
        	x = n;
        }
        public void setY(int n){
        	y = n;
        }
        public void move() {
                y = y + dy;
        }
 
        public int getX() {
                return x;
        }
 
        public int getY() {
                return y;
        }
 
        public Image getImage() {
                return still;
        }
 
        public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_SPACE)
                        dy = -3;
 
                
        }
 
        public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_LEFT)
                        dy = 0;
 
                if (key == KeyEvent.VK_RIGHT)
                        dy = 0;
        }
 
}