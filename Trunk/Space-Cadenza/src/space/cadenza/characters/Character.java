package space.cadenza.characters;

public class Character extends SpaceObjects {
	//TODO: flesh out methods and necessary variables
	//integer representation of alien health
		private int hp;
	
	public Character() {
		super();
	}
	
	public Character(int xCoordinate, int yCoordinate, int speed, String image, int health) {
		super(xCoordinate, yCoordinate, speed, image);
		setHealth(health);
	}
	
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		hp = health;
	}
	
	public int getHealth() {
		return hp;
	}
}
