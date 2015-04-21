package space.cadenza.characters;

public class Alien extends Character {
	
	
	public Alien() {
		
	}
	
	public Alien(int health,int rateOfFire, String image, int xCoordinate, int yCoordinate, int speed)
	{
		super(xCoordinate, yCoordinate, speed, image, health,rateOfFire);
		
	}
	
}
