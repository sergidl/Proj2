package cat.institutmvm.application.entities;
import cat.institutmvm.application.utils.MyMath;

public class Colour {
	private String name;
	private int red, green, blue;
	public static final String NO_NAME = "undefined";
	private static int counter = 0;
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 255;

	public Colour(String name, int red, int green, int blue) {
		this.setName(name);
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}

	public Colour(int red, int green, int blue) {
		this(NO_NAME, red, green, blue);
	}
	public Colour() {
		this(NO_NAME, MAX_VALUE, MAX_VALUE, MAX_VALUE);
	}
	public Colour(String name) {

	 	this(name, MyMath.randomInt(0, 255), MyMath.randomInt(0, 255), MyMath.randomInt(0, 255));
	}
	



	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRed() {
		return this.red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return this.green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return this.blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}


	
}
