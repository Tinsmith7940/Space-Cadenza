package space.cadenza.characters;

public class Alien extends Character {
	
	//integer representation of alien rate of fire
	private int fireRate;
	
	
	public Alien() {
		
	}
	
	public Alien(int health,int rateOfFire, String image, int xCoordinate, int yCoordinate, int speed)
	{
		super(xCoordinate, yCoordinate, speed, image, health);
		setRateOfFire(rateOfFire);
	}
	
	public void setRateOfFire(int rateOfFire) {
		// TODO Auto-generated method stub
		fireRate = rateOfFire;
	}
	
	public int getRateOfFire() {
		return fireRate;
	}
	
}
