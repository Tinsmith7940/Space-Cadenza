package space.cadenza.characters;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpaceObjects {
	//File path of the alien sprite
	private String imageSprite;
	//X and Y coordinates of alien's current location
	//X is located at index '0', and Y is located at index '1' in the array
	private int[] currentLocation = new int[2];
	//Speed that the object can travel
	private int speed;
	private Image image;
	
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
	public void setCurrentXLocation(int x)
	{
		currentLocation[0] = x;
	}
	public void setCurrentYLocation(int y)
	{
		currentLocation[1] = y;
	}
	
	public int getCurrentXLocation() {
		return currentLocation[0];
	}
	public int getCurrentYLocation() {
		return currentLocation[1];
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
	
	public void createSprite(String Sprite) {
		try {
			image = ImageIO.read(new File(Sprite));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
