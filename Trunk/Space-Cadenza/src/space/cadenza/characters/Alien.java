package space.cadenza.characters;

public class Alien {
	//File path of the alien sprite
	private String imageSprite;
	//integer representation of alien health
	private int hp;
	//integer representation of alien rate of fire
	private int fireRate;
	//X and Y coordinates of alien's current location
	//X is located at index '0', and Y is located at index '1' in the array
	private int[] currentLocation = new int[2];
	
	
	public Alien() {
		
	}
	
	public Alien(int health,int rateOfFire, String image, int xCoordinate, int yCoordinate)
	{
		setHealth(health);
		setRateOfFire(rateOfFire);
		setSprite(image);
		setCurrentLocation(xCoordinate, yCoordinate); //TODO: need to pass in random spawn location upon creation
	}

	
	public void setSprite(String image) {
		// TODO Auto-generated method stub
		imageSprite = image;
	}
	
	public String getSprite() {
		return imageSprite;
	}

	public void setRateOfFire(int rateOfFire) {
		// TODO Auto-generated method stub
		fireRate = rateOfFire;
	}
	
	public int getRateOfFire() {
		return fireRate;
	}

	public void setHealth(int health) {
		// TODO Auto-generated method stub
		hp = health;
	}
	
	public int getHealth() {
		return hp;
	}
	
	public void setCurrentLocation(int x, int y){
		currentLocation[0] = x;
		currentLocation[1] = y;
	}
	
	public int[] getCurrentLocation() {
		return currentLocation;
	}
	
}
