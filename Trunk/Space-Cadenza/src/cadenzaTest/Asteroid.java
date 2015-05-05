package cadenzaTest;

import java.awt.*;
import java.awt.event.KeyEvent;
 
import javax.swing.ImageIcon;
 
public class Asteroid {
        int x, y, dy;
        Image still;
 
        public Asteroid() {
                ImageIcon i = new ImageIcon("images/smallasteroid.png");
                still = i.getImage();
                x = 10;
                y = 10;
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
                if (key == KeyEvent.VK_LEFT)
                        dy = -10;
 
                if (key == KeyEvent.VK_RIGHT)
                        dy = 10;
        }
 
        public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_LEFT)
                        dy = 0;
 
                if (key == KeyEvent.VK_RIGHT)
                        dy = 0;
        }
 
}