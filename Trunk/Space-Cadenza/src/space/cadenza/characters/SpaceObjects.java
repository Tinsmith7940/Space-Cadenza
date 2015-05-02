package space.cadenza.characters;

public class SpaceObjects {
	//File path of the alien sprite
	private String imageSprite;
	//X and Y coordinates of alien's current location
	//X is located at index '0', and Y is located at index '1' in the array
	private int[] currentLocation = new int[2];
	//Speed that the object can travel
	private int speed;
	
	public SpaceObjects() {
		
	}
	
	public SpaceObjects(int xCoordinate, int yCoordinate, int speed, String image) {
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
	
	public void setCurrentLocation(int x, int y){
		currentLocation[0] = x;
		currentLocation[1] = y;
	}
	
	public int[] getCurrentLocation() {
		return currentLocation;
	}
	
	public void setSpeed(int spd){
		speed = spd;
	}
	public int getSpeed(){
		return speed;
	}
	
	public void move(int x, int y) {
		//TODO: Put logic here
	}
	
}
