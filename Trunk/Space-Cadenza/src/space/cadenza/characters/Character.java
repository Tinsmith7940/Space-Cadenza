package space.cadenza.characters;

public class Character extends SpaceObjects {
	//TODO: flesh out methods and necessary variables
	//integer representation of alien health
		private int hp;
	//integer representation of alien rate of fire
	private int fireRate;
	
	public Character() {
		super();
	}
	
	public Character(int xCoordinate, int yCoordinate, int speed, String image, int health, int rateOfFire) {
		super(xCoordinate, yCoordinate, speed, image);
		setHealth(health);
		setRateOfFire(rateOfFire);
	}
	
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		hp = health;
	}
	
	public int getHealth() {
		return hp;
	}
	public void setRateOfFire(int rateOfFire) {
		// TODO Auto-generated method stub
		fireRate = rateOfFire;
	}
	
	public int getRateOfFire() {
		return fireRate;
	}
}
