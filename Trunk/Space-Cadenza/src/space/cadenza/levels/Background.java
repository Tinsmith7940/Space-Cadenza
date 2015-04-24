package space.cadenza.levels;
public Background(){
	this(0,0);
}

public Background(int x, int y){
	this.x =x;
	this.y = y;
	
	try {
		image = ImageIO.read(new File(images/Mars.jpg));
	}
	catch(Exception e) {System.out.println(e);}
}

public void draw (Graphics window) {
	window.drawImage(image, getX(), getY(), image.getWidth(), image.getHeight(), null );
	this.y -= 5;
	if(this.y <= -1 * image.getWidth()){
		this.y = this.y +image.getWidth() * 2;
	}
}

public void setX(int x) {
	this.x =x;
}

public int getX() {
	return this.x;
}
public int getY() {
	return this.y;
}

public int getImageWidth(){
	return image.getWidth();
}

public String toString () {
	return "Background: x=&amp;amp;amp;quot;" + getX() + ", y=" + getY() + ", height=" + image.getHeight() + ", width=" + image.getWidth();
}
}

