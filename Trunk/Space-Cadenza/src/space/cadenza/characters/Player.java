package space.cadenza.characters;

import java.awt.Image;


public class Player extends Character {
	public static final String PLAYER_SPRITE = "images/SpaceShip.png";
	Image image;
	Player() {
		super(300, 20, 2, PLAYER_SPRITE, 5, 2 );
	}
	
	public Image getImage(){
		return image;
	}
}
